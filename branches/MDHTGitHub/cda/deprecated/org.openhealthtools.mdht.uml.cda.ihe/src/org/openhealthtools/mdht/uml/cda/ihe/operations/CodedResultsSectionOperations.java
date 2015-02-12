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
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Results Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#validateCodedResultsSectionSimpleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getExternalReferences() <em>Get External References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection#getSimpleObservations() <em>Get Simple Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedResultsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedResultsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.28')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionTemplateId(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.28')
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodedResultsSectionTemplateId(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("CodedResultsSectionTemplateId"),
						 new Object [] { codedResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionCode(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodedResultsSectionCode(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("CodedResultsSectionCode"),
						 new Object [] { codedResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionExternalReference(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ExternalReference))
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodedResultsSectionExternalReference(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_EXTERNAL_REFERENCE,
						 IHEPlugin.INSTANCE.getString("CodedResultsSectionExternalReference"),
						 new Object [] { codedResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::SimpleObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Results Section Simple Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedResultsSectionSimpleObservation(CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::SimpleObservation))
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodedResultsSectionSimpleObservation(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_RESULTS_SECTION);
			try {
				VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedResultsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_SIMPLE_OBSERVATION,
						 IHEPlugin.INSTANCE.getString("CodedResultsSectionSimpleObservation"),
						 new Object [] { codedResultsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalReferences(CodedResultsSection) <em>Get External References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference)).oclAsType(ihe::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalReferences(CodedResultsSection) <em>Get External References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference)).oclAsType(ihe::ExternalReference)
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ExternalReference> getExternalReferences(CodedResultsSection codedResultsSection) {
		if (GET_EXTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.CODED_RESULTS_SECTION, IHEPackage.Literals.CODED_RESULTS_SECTION.getEAllOperations().get(51));
			try {
				GET_EXTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GET_EXTERNAL_REFERENCES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ExternalReference> result = (Collection<ExternalReference>) query.evaluate(codedResultsSection);
		return new BasicEList.UnmodifiableEList<ExternalReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSimpleObservations(CodedResultsSection) <em>Get Simple Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObservations(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SIMPLE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation)).oclAsType(ihe::SimpleObservation)";

	/**
	 * The cached OCL query for the '{@link #getSimpleObservations(CodedResultsSection) <em>Get Simple Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObservations(CodedResultsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SIMPLE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation)).oclAsType(ihe::SimpleObservation)
	 * @param codedResultsSection The receiving '<em><b>Coded Results Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<SimpleObservation> getSimpleObservations(CodedResultsSection codedResultsSection) {
		if (GET_SIMPLE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IHEPackage.Literals.CODED_RESULTS_SECTION, IHEPackage.Literals.CODED_RESULTS_SECTION.getEAllOperations().get(52));
			try {
				GET_SIMPLE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SIMPLE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SIMPLE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SimpleObservation> result = (Collection<SimpleObservation>) query.evaluate(codedResultsSection);
		return new BasicEList.UnmodifiableEList<SimpleObservation>(result.size(), result.toArray());
	}

} // CodedResultsSectionOperations