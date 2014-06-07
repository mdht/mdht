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
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection#validateHITSPEncountersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounters Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection#validateHITSPEncountersSectionEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounters Section Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection#getHITSPEncounterEntries() <em>Get HITSP Encounter Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersSectionOperations extends EncounterHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounters Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.127')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounters Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.127')
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPEncountersSectionTemplateId(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.ENCOUNTERS_SECTION__HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("HITSPEncountersSectionTemplateId"),
						 new Object [] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPEncountersSectionEncounter(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounters Section Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncountersSectionEncounter(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_ENCOUNTERS_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(hitsp::Encounter))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPEncountersSectionEncounter(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounters Section Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncountersSectionEncounter(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_ENCOUNTERS_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(hitsp::Encounter))
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPEncountersSectionEncounter(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_ENCOUNTERS_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_HITSP_ENCOUNTERS_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_ENCOUNTERS_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_ENCOUNTERS_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.ENCOUNTERS_SECTION__HITSP_ENCOUNTERS_SECTION_ENCOUNTER,
						 HITSPPlugin.INSTANCE.getString("HITSPEncountersSectionEncounter"),
						 new Object [] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPEncounterEntries(EncountersSection) <em>Get HITSP Encounter Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPEncounterEntries(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_ENCOUNTER_ENTRIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(hitsp::Encounter)).oclAsType(hitsp::Encounter)";

	/**
	 * The cached OCL query for the '{@link #getHITSPEncounterEntries(EncountersSection) <em>Get HITSP Encounter Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPEncounterEntries(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_ENCOUNTER_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(hitsp::Encounter)).oclAsType(hitsp::Encounter)
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Encounter> getHITSPEncounterEntries(EncountersSection encountersSection) {
		if (GET_HITSP_ENCOUNTER_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.ENCOUNTERS_SECTION, HITSPPackage.Literals.ENCOUNTERS_SECTION.getEAllOperations().get(55));
			try {
				GET_HITSP_ENCOUNTER_ENTRIES__EOCL_QRY = helper.createQuery(GET_HITSP_ENCOUNTER_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_ENCOUNTER_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(encountersSection);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

} // EncountersSectionOperations