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
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PurposeSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PurposeSectionImpl extends SectionImpl implements PurposeSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PURPOSE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeSectionOperations.validatePurposeSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeSectionOperations.validatePurposeSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeSectionOperations.validatePurposeSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeSectionOperations.validatePurposeSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSectionPurposeActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeSectionOperations.validatePurposeSectionPurposeActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurposeActivity> getPurposeActivities() {
		return PurposeSectionOperations.getPurposeActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PurposeSectionImpl
