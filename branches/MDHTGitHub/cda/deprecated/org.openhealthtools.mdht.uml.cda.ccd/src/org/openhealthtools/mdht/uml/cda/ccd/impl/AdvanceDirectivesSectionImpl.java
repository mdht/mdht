/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectivesSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directives Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectivesSectionImpl extends SectionImpl implements AdvanceDirectivesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectivesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ADVANCE_DIRECTIVES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSectionAdvanceDirectiveObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSectionOperations.validateAdvanceDirectivesSectionAdvanceDirectiveObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvanceDirectiveObservation> getAdvanceDirectiveObservations() {
		return AdvanceDirectivesSectionOperations.getAdvanceDirectiveObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //AdvanceDirectivesSectionImpl
