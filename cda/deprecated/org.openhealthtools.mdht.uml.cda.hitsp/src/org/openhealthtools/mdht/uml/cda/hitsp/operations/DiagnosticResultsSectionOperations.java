/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#validateDiagnosticResultsSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getDiagnosticProcedures() <em>Get Diagnostic Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection#getResults() <em>Get Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticResultsSectionOperations extends CodedResultsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.122')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.122')
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionTemplateId"),
						 new Object [] { diagnosticResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hitsp::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionProcedure(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hitsp::Procedure))
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsSectionProcedure(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_PROCEDURE,
						 HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionProcedure"),
						 new Object [] { diagnosticResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hitsp::Result))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Results Section Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticResultsSectionResult(DiagnosticResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hitsp::Result))
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticResultsSectionResult(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION);
			try {
				VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_RESULTS_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT,
						 HITSPPlugin.INSTANCE.getString("DiagnosticResultsSectionResult"),
						 new Object [] { diagnosticResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticProcedures(DiagnosticResultsSection) <em>Get Diagnostic Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticProcedures(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hitsp::Procedure)).oclAsType(hitsp::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticProcedures(DiagnosticResultsSection) <em>Get Diagnostic Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticProcedures(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hitsp::Procedure)).oclAsType(hitsp::Procedure)
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getDiagnosticProcedures(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION, HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(56));
			try {
				GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_PROCEDURES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResults(DiagnosticResultsSection) <em>Get Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::Result)).oclAsType(hitsp::Result)";

	/**
	 * The cached OCL query for the '{@link #getResults(DiagnosticResultsSection) <em>Get Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(DiagnosticResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::Result)).oclAsType(hitsp::Result)
	 * @param diagnosticResultsSection The receiving '<em><b>Diagnostic Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Result> getResults(DiagnosticResultsSection diagnosticResultsSection) {
		if (GET_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION, HITSPPackage.Literals.DIAGNOSTIC_RESULTS_SECTION.getEAllOperations().get(57));
			try {
				GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Result> result = (Collection<Result>) query.evaluate(diagnosticResultsSection);
		return new BasicEList.UnmodifiableEList<Result>(result.size(), result.toArray());
	}

} // DiagnosticResultsSectionOperations