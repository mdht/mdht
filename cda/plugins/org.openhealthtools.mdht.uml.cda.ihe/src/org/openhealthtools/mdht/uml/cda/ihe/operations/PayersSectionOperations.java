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
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection#validateIHEPayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection#validateIHEPayersSectionCoverageEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Coverage Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection#getCoverageEntries() <em>Get Coverage Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayersSectionOperations extends org.openhealthtools.mdht.uml.cda.ccd.operations.PayersSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7')
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateIHEPayersSectionTemplateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PAYERS_SECTION);
			try {
				VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PAYERS_SECTION__IHE_PAYERS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("IHEPayersSectionTemplateId"),
						 new Object [] { payersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEPayersSectionCoverageEntry(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Coverage Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEPayersSectionCoverageEntry(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::CoverageEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEPayersSectionCoverageEntry(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Payers Section Coverage Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEPayersSectionCoverageEntry(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::CoverageEntry))
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateIHEPayersSectionCoverageEntry(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PAYERS_SECTION);
			try {
				VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_PAYERS_SECTION_COVERAGE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PAYERS_SECTION__IHE_PAYERS_SECTION_COVERAGE_ENTRY,
						 IHEPlugin.INSTANCE.getString("IHEPayersSectionCoverageEntry"),
						 new Object [] { payersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCoverageEntries(PayersSection) <em>Get Coverage Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageEntries(PayersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COVERAGE_ENTRIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::CoverageEntry)).oclAsType(ihe::CoverageEntry)";

	/**
	 * The cached OCL query for the '{@link #getCoverageEntries(PayersSection) <em>Get Coverage Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageEntries(PayersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COVERAGE_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::CoverageEntry)).oclAsType(ihe::CoverageEntry)
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<CoverageEntry> getCoverageEntries(PayersSection payersSection) {
		if (GET_COVERAGE_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.PAYERS_SECTION, IHEPackage.Literals.PAYERS_SECTION.getEAllOperations().get(55));
			try {
				GET_COVERAGE_ENTRIES__EOCL_QRY = helper.createQuery(GET_COVERAGE_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COVERAGE_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CoverageEntry> result = (Collection<CoverageEntry>) query.evaluate(payersSection);
		return new BasicEList.UnmodifiableEList<CoverageEntry>(result.size(), result.toArray());
	}

} // PayersSectionOperations