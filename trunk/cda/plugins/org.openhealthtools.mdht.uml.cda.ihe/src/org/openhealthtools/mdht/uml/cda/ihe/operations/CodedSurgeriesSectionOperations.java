/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#CodedSurgeriesSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Surgeries Section template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedSurgeriesSectionOperations extends SurgeriesSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedSurgeriesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #CodedSurgeriesSection_templateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Surgeries Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CodedSurgeriesSection_templateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.12')";

	/**
	 * The cached OCL invariant for the '{@link #CodedSurgeriesSection_templateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Coded Surgeries Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CodedSurgeriesSection_templateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.12')
	 * @param codedSurgeriesSection The receiving '<em><b>Coded Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean CodedSurgeriesSection_templateId(CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_SURGERIES_SECTION);
			try {
				CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(codedSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("CodedSurgeriesSection_templateId"),
						 new Object [] { codedSurgeriesSection }));
			}
			return false;
		}
		return true;
	}

} // CodedSurgeriesSectionOperations