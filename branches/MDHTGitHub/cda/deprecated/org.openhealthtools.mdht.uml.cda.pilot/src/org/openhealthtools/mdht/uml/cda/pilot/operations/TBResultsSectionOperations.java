/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.pilot.PilotPlugin;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTBResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateTBResultsSectionTBResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate TB Results Section TB Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#getTbResultOrganizers() <em>Get Tb Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#getTbResultObservations() <em>Get Tb Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection#validateResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}</li>
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
	protected static final String VALIDATE_TB_RESULTS_SECTION_TB_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(pilot::TBResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

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
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(pilot::TBResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
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
	protected static final String VALIDATE_TB_RESULTS_SECTION_TB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(pilot::TBResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

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
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(pilot::TBResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
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

	/**
	 * The cached OCL expression body for the '{@link #getTbResultOrganizers(TBResultsSection) <em>Get Tb Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbResultOrganizers(TBResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TB_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(pilot::TBResultOrganizer)).oclAsType(pilot::TBResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getTbResultOrganizers(TBResultsSection) <em>Get Tb Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbResultOrganizers(TBResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TB_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(pilot::TBResultOrganizer)).oclAsType(pilot::TBResultOrganizer)
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<TBResultOrganizer> getTbResultOrganizers(TBResultsSection tbResultsSection) {
		if (GET_TB_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TBPNPackage.Literals.TB_RESULTS_SECTION, TBPNPackage.Literals.TB_RESULTS_SECTION.getEAllOperations().get(57));
			try {
				GET_TB_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_TB_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TB_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TBResultOrganizer> result = (Collection<TBResultOrganizer>) query.evaluate(tbResultsSection);
		return new BasicEList.UnmodifiableEList<TBResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTbResultObservations(TBResultsSection) <em>Get Tb Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbResultObservations(TBResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TB_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pilot::TBResultObservation)).oclAsType(pilot::TBResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getTbResultObservations(TBResultsSection) <em>Get Tb Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbResultObservations(TBResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TB_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pilot::TBResultObservation)).oclAsType(pilot::TBResultObservation)
	 * @param tbResultsSection The receiving '<em><b>TB Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<TBResultObservation> getTbResultObservations(TBResultsSection tbResultsSection) {
		if (GET_TB_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TBPNPackage.Literals.TB_RESULTS_SECTION, TBPNPackage.Literals.TB_RESULTS_SECTION.getEAllOperations().get(58));
			try {
				GET_TB_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TB_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TB_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TBResultObservation> result = (Collection<TBResultObservation>) query.evaluate(tbResultsSection);
		return new BasicEList.UnmodifiableEList<TBResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateResultsSectionTemplateId(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tbResultsSection, context) }),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionCode(TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateResultsSectionCode(TBResultsSection tbResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TB_RESULTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tbResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TB_RESULTS_SECTION__RESULTS_SECTION_CODE,
						 PilotPlugin.INSTANCE.getString("ResultsSectionCode"),
						 new Object [] { tbResultsSection }));
			}
			return false;
		}
		return true;
	}

} // TBResultsSectionOperations