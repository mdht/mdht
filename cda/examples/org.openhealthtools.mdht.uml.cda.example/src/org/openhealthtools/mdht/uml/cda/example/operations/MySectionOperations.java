/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.example.operations;

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
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.MySection;
import org.openhealthtools.mdht.uml.cda.example.util.ExampleValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>My Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#validateMySectionMyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section My Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MySection#getMyObservations() <em>Get My Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionTemplateId(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.1')
	 * @param mySection The receiving '<em><b>My Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMySectionTemplateId(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_SECTION__MY_SECTION_TEMPLATE_ID,
						 ExamplePlugin.INSTANCE.getString("MySectionTemplateId"),
						 new Object [] { mySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '48764-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '48764-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param mySection The receiving '<em><b>My Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMySectionCode(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_SECTION__MY_SECTION_CODE,
						 ExamplePlugin.INSTANCE.getString("MySectionCode"),
						 new Object [] { mySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.confidentialityCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionConfidentialityCode(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.confidentialityCode.oclIsUndefined()
	 * @param mySection The receiving '<em><b>My Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMySectionConfidentialityCode(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_SECTION__MY_SECTION_CONFIDENTIALITY_CODE,
						 ExamplePlugin.INSTANCE.getString("MySectionConfidentialityCode"),
						 new Object [] { mySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionTitle(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param mySection The receiving '<em><b>My Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMySectionTitle(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_SECTION__MY_SECTION_TITLE,
						 ExamplePlugin.INSTANCE.getString("MySectionTitle"),
						 new Object [] { mySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section My Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(example::MyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Section My Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMySectionMyObservation(MySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(example::MyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)
	 * @param mySection The receiving '<em><b>My Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMySectionMyObservation(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_SECTION);
			try {
				VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_SECTION_MY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_SECTION__MY_SECTION_MY_OBSERVATION,
						 ExamplePlugin.INSTANCE.getString("MySectionMyObservation"),
						 new Object [] { mySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMyObservations(MySection) <em>Get My Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyObservations(MySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(example::MyObservation)).oclAsType(example::MyObservation)";

	/**
	 * The cached OCL query for the '{@link #getMyObservations(MySection) <em>Get My Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyObservations(MySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(example::MyObservation)).oclAsType(example::MyObservation)
	 * @param mySection The receiving '<em><b>My Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<MyObservation> getMyObservations(MySection mySection) {
		if (GET_MY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ExamplePackage.Literals.MY_SECTION, ExamplePackage.Literals.MY_SECTION.getEAllOperations().get(52));
			try {
				GET_MY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MyObservation> result = (Collection<MyObservation>) query.evaluate(mySection);
		return new BasicEList.UnmodifiableEList<MyObservation>(result.size(), result.toArray());
	}

} // MySectionOperations