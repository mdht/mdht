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
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySectionImpl extends SectionImpl implements FamilyHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FAMILY_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean FamilyHistorySection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.FamilyHistorySection_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean FamilyHistorySection_code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.FamilyHistorySection_code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean FamilyHistorySection_title(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionOperations.FamilyHistorySection_title(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //FamilyHistorySectionImpl
