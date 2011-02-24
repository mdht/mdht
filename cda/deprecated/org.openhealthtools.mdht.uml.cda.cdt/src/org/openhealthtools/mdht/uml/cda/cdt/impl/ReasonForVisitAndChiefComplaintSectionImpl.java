/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ReasonForVisitAndChiefComplaintSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason For Visit And Chief Complaint Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReasonForVisitAndChiefComplaintSectionImpl extends SectionImpl implements ReasonForVisitAndChiefComplaintSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForVisitAndChiefComplaintSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitAndChiefComplaintSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForVisitAndChiefComplaintSectionOperations.validateReasonForVisitAndChiefComplaintSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitAndChiefComplaintSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForVisitAndChiefComplaintSectionOperations.validateReasonForVisitAndChiefComplaintSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitAndChiefComplaintSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ReasonForVisitAndChiefComplaintSectionImpl
