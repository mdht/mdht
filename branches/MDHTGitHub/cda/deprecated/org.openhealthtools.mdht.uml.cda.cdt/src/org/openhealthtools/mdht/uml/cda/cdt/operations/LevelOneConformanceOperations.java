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
import org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level One Conformance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance#validateLevelOneConformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level One Conformance Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelOneConformanceOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelOneConformanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOneConformanceTemplateId(LevelOneConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level One Conformance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOneConformanceTemplateId(LevelOneConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOneConformanceTemplateId(LevelOneConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level One Conformance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOneConformanceTemplateId(LevelOneConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.10')
	 * @param levelOneConformance The receiving '<em><b>Level One Conformance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateLevelOneConformanceTemplateId(LevelOneConformance levelOneConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.LEVEL_ONE_CONFORMANCE);
			try {
				VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(levelOneConformance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.LEVEL_ONE_CONFORMANCE__LEVEL_ONE_CONFORMANCE_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("LevelOneConformanceTemplateId"),
						 new Object [] { levelOneConformance }));
			}
			return false;
		}
		return true;
	}

} // LevelOneConformanceOperations