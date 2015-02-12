/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FunctionalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionImpl extends SectionImpl implements FunctionalStatusSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionClinicalStatements(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionClinicalStatements(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //FunctionalStatusSectionImpl
