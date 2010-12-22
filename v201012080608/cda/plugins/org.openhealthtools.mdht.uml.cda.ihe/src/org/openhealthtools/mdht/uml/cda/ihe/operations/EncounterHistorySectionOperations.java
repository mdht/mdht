/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection#validateEncounterHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection#validateEncounterHistorySectionEncounterEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Encounter Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection#getEncounterEntries() <em>Get Encounter Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterHistorySectionOperations extends EncountersSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterHistorySectionTemplateId(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterHistorySectionTemplateId(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.5.3.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterHistorySectionTemplateId(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterHistorySectionTemplateId(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.5.3.3')
	 * @param encounterHistorySection The receiving '<em><b>Encounter History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterHistorySectionTemplateId(EncounterHistorySection encounterHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ENCOUNTER_HISTORY_SECTION);
			try {
				VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ENCOUNTER_HISTORY_SECTION__ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("EncounterHistorySectionTemplateId"),
						 new Object [] { encounterHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterHistorySectionEncounterEntry(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Encounter Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterHistorySectionEncounterEntry(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(ihe::EncounterEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterHistorySectionEncounterEntry(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter History Section Encounter Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterHistorySectionEncounterEntry(EncounterHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(ihe::EncounterEntry))
	 * @param encounterHistorySection The receiving '<em><b>Encounter History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEncounterHistorySectionEncounterEntry(EncounterHistorySection encounterHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ENCOUNTER_HISTORY_SECTION);
			try {
				VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ENCOUNTER_HISTORY_SECTION__ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY,
						 IHEPlugin.INSTANCE.getString("EncounterHistorySectionEncounterEntry"),
						 new Object [] { encounterHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounterEntries(EncounterHistorySection) <em>Get Encounter Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterEntries(EncounterHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER_ENTRIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(ihe::EncounterEntry)).oclAsType(ihe::EncounterEntry)";

	/**
	 * The cached OCL query for the '{@link #getEncounterEntries(EncounterHistorySection) <em>Get Encounter Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterEntries(EncounterHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(ihe::EncounterEntry)).oclAsType(ihe::EncounterEntry)
	 * @param encounterHistorySection The receiving '<em><b>Encounter History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<EncounterEntry> getEncounterEntries(EncounterHistorySection encounterHistorySection) {
		if (GET_ENCOUNTER_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.ENCOUNTER_HISTORY_SECTION, IHEPackage.Literals.ENCOUNTER_HISTORY_SECTION.getEAllOperations().get(52));
			try {
				GET_ENCOUNTER_ENTRIES__EOCL_QRY = helper.createQuery(GET_ENCOUNTER_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterEntry> result = (Collection<EncounterEntry>) query.evaluate(encounterHistorySection);
		return new BasicEList.UnmodifiableEList<EncounterEntry>(result.size(), result.toArray());
	}

} // EncounterHistorySectionOperations