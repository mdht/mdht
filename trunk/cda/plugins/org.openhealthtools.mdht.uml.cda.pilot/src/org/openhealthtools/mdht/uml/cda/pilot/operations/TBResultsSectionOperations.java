/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.pilot.PilotPlugin;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.util.TBPNValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>TB Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTBResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTBResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBResultsSectionOperations extends ResultsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTBResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TB_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateTBResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TB_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6')
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTBResultsSectionTemplateId(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TB_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_TB_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TB_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TB_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__TB_RESULTS_SECTION_TEMPLATE_ID,
						 PilotPlugin.INSTANCE.getString("TBResultsSectionTemplateId"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTBResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TB_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTBResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TB_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTBResultsSectionCode(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TB_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_TB_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TB_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TB_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__TB_RESULTS_SECTION_CODE,
						 PilotPlugin.INSTANCE.getString("TBResultsSectionCode"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTBResultsSectionText(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionText(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TB_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateTBResultsSectionText(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionText(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TB_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTBResultsSectionText(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TB_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_TB_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TB_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TB_RESULTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__TB_RESULTS_SECTION_TEXT,
						 PilotPlugin.INSTANCE.getString("TBResultsSectionText"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTBResultsSectionTitle(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTitle(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TB_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.title.getText() = 'Relevant diagnostic tests and/or laboratory data'";

	/**
	 * The cached OCL invariant for the '{@link #validateTBResultsSectionTitle(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTitle(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TB_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.title.getText() = 'Relevant diagnostic tests and/or laboratory data'
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTBResultsSectionTitle(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TB_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_TB_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TB_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TB_RESULTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__TB_RESULTS_SECTION_TITLE,
						 PilotPlugin.INSTANCE.getString("TBResultsSectionTitle"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTBResultsSectionTBResultOrganizer(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTBResultOrganizer(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(pilot::TBResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTBResultsSectionTBResultOrganizer(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTBResultOrganizer(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(pilot::TBResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTBResultsSectionTBResultOrganizer(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__TB_RESULTS_SECTION_TB_RESULT_ORGANIZER,
						 PilotPlugin.INSTANCE.getString("TBResultsSectionTBResultOrganizer"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTBResultsSectionTBResultObservation(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTBResultObservation(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.observation.oclIsKindOf(pilot::TBResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateTBResultsSectionTBResultObservation(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTBResultsSectionTBResultObservation(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.observation.oclIsKindOf(pilot::TBResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTBResultsSectionTBResultObservation(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__TB_RESULTS_SECTION_TB_RESULT_OBSERVATION,
						 PilotPlugin.INSTANCE.getString("TBResultsSectionTBResultObservation"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

} // TBResultsSectionOperations