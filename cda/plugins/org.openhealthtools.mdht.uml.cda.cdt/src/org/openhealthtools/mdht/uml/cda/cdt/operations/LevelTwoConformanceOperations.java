/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level Two Conformance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance#validateLevelTwoConformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Two Conformance Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelTwoConformanceOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelTwoConformanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelTwoConformanceTemplateId(LevelTwoConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Two Conformance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelTwoConformanceTemplateId(LevelTwoConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_TWO_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelTwoConformanceTemplateId(LevelTwoConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Two Conformance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelTwoConformanceTemplateId(LevelTwoConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LEVEL_TWO_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.20')
	 * @param levelTwoConformance The receiving '<em><b>Level Two Conformance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateLevelTwoConformanceTemplateId(LevelTwoConformance levelTwoConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LEVEL_TWO_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.LEVEL_TWO_CONFORMANCE);
			try {
				VALIDATE_LEVEL_TWO_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_TWO_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_TWO_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(levelTwoConformance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.LEVEL_TWO_CONFORMANCE__LEVEL_TWO_CONFORMANCE_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("LevelTwoConformanceTemplateId"),
						 new Object [] { levelTwoConformance }));
			}
			return false;
		}
		return true;
	}

} // LevelTwoConformanceOperations