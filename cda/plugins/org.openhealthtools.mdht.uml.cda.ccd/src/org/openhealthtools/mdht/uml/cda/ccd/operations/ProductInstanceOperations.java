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
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProductInstance#ProductInstance_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Product Instance template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProductInstance#ProductInstance_classCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Product Instance class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductInstanceOperations extends ParticipantRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProductInstance_templateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Product Instance template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProductInstance_templateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.52')";

	/**
	 * The cached OCL invariant for the '{@link #ProductInstance_templateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Product Instance template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProductInstance_templateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.52')
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProductInstance_templateId(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT_INSTANCE);
			try {
				PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(productInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ProductInstance_templateId"),
						 new Object [] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProductInstance_classCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Product Instance class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProductInstance_classCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.classCode.oclIsUndefined() and self.classCode=vocab::RoleClassRoot::MANU";

	/**
	 * The cached OCL invariant for the '{@link #ProductInstance_classCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Product Instance class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProductInstance_classCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.classCode.oclIsUndefined() and self.classCode=vocab::RoleClassRoot::MANU
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProductInstance_classCode(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PRODUCT_INSTANCE);
			try {
				PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(productInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("ProductInstance_classCode"),
						 new Object [] { productInstance }));
			}
			return false;
		}
		return true;
	}

} // ProductInstanceOperations