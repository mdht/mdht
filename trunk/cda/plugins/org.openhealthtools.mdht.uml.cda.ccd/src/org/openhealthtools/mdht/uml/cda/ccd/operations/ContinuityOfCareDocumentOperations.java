/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocumentOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #templateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #templateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1')";

	/**
	 * The cached OCL invariant for the '{@link #templateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #templateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1')
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean templateId(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.CONTINUITY_OF_CARE_DOCUMENT__TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "templateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(continuityOfCareDocument, context) }),
						 new Object [] { continuityOfCareDocument }));
			}
			return false;
		}
		return true;
	}

} // ContinuityOfCareDocumentOperations