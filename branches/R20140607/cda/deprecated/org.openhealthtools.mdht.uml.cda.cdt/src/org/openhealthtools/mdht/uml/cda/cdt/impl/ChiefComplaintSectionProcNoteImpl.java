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
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ChiefComplaintSectionProcNoteOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chief Complaint Section Proc Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintSectionProcNoteImpl extends SectionImpl implements ChiefComplaintSectionProcNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChiefComplaintSectionProcNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.CHIEF_COMPLAINT_SECTION_PROC_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSectionProcNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChiefComplaintSectionProcNoteOperations.validateChiefComplaintSectionProcNoteTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSectionProcNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ChiefComplaintSectionProcNoteOperations.validateChiefComplaintSectionProcNoteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSectionProcNote init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ChiefComplaintSectionProcNoteImpl
