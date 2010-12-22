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
import org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level Three Conformance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance#validateLevelOneConformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level One Conformance Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelThreeConformanceOperations extends LevelTwoConformanceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelThreeConformanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLevelOneConformanceTemplateId(LevelThreeConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level One Conformance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOneConformanceTemplateId(LevelThreeConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateLevelOneConformanceTemplateId(LevelThreeConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level One Conformance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLevelOneConformanceTemplateId(LevelThreeConformance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30')
	 * @param levelThreeConformance The receiving '<em><b>Level Three Conformance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateLevelOneConformanceTemplateId(LevelThreeConformance levelThreeConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.LEVEL_THREE_CONFORMANCE);
			try {
				VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LEVEL_ONE_CONFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(levelThreeConformance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.LEVEL_THREE_CONFORMANCE__LEVEL_ONE_CONFORMANCE_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LevelOneConformanceTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(levelThreeConformance, context) }),
						 new Object [] { levelThreeConformance }));
			}
			return false;
		}
		return true;
	}

} // LevelThreeConformanceOperations