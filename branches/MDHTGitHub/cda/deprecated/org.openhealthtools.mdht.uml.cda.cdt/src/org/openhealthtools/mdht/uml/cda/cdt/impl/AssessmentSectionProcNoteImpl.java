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
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.operations.AssessmentSectionProcNoteOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Section Proc Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentSectionProcNoteImpl extends SectionImpl implements AssessmentSectionProcNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSectionProcNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.ASSESSMENT_SECTION_PROC_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSectionProcNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentSectionProcNoteOperations.validateAssessmentSectionProcNoteTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSectionProcNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentSectionProcNoteOperations.validateAssessmentSectionProcNoteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSectionProcNote init() {
    		CDAUtil.init(this);
    		return this;
	}
} //AssessmentSectionProcNoteImpl
