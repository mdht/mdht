/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Author#validateTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Author#validateContextControlCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Control Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Author#getClinicalDocument() <em>Get Clinical Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorOperations extends ParticipationOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTypeCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTypeCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeCode.oclIsUndefined() implies self.typeCode=vocab::ParticipationType::AUT";
	/**
	 * The cached OCL invariant for the '{@link #validateTypeCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTypeCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.typeCode.oclIsUndefined() implies self.typeCode=vocab::ParticipationType::AUT
	 * @param author The receiving '<em><b>Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTypeCode(Author author, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.AUTHOR);
			try {
				VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(author)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.AUTHOR__TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(author, context) }),
						 new Object [] { author }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContextControlCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Control Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContextControlCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.contextControlCode.oclIsUndefined() implies self.contextControlCode=vocab::ContextControl::OP";
	/**
	 * The cached OCL invariant for the '{@link #validateContextControlCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Control Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContextControlCode(Author, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.contextControlCode.oclIsUndefined() implies self.contextControlCode=vocab::ContextControl::OP
	 * @param author The receiving '<em><b>Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateContextControlCode(Author author, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.AUTHOR);
			try {
				VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(author)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.AUTHOR__CONTEXT_CONTROL_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateContextControlCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(author, context) }),
						 new Object [] { author }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  ClinicalDocument getClinicalDocument(Author author) {
		return CDAUtil.getClinicalDocument(author);
	}

} // AuthorOperations