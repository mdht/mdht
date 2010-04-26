/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.LanguageCommunicationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Language Spoken</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken#validateLanguageSpokenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageSpokenOperations extends LanguageCommunicationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageSpokenOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenTemplateId(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.2')
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateLanguageSpokenTemplateId(LanguageSpoken languageSpoken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LANGUAGE_SPOKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("LanguageSpokenTemplateId"),
						 new Object [] { languageSpoken }));
			}
			return false;
		}
		return true;
	}

} // LanguageSpokenOperations