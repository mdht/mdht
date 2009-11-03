/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

import org.openhealthtools.mdht.uml.cda.ihe.operations.ChiefComplaintSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chief Complaint Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintSectionImpl extends SectionImpl implements ChiefComplaintSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChiefComplaintSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.CHIEF_COMPLAINT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ChiefComplaintSection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChiefComplaintSectionOperations.ChiefComplaintSection_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ChiefComplaintSection_code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChiefComplaintSectionOperations.ChiefComplaintSection_code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ChiefComplaintSectionImpl
