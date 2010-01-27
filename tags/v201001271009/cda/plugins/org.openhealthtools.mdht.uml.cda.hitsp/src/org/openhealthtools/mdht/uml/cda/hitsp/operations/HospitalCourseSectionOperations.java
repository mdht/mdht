/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Course Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection#validateHITSPHospitalCourseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Course Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalCourseSectionOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.HospitalCourseSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalCourseSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Course Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.121')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Course Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.121')
	 * @param hospitalCourseSection The receiving '<em><b>Hospital Course Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPHospitalCourseSectionTemplateId(HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.HOSPITAL_COURSE_SECTION);
			try {
				VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalCourseSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.HOSPITAL_COURSE_SECTION__HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("HITSPHospitalCourseSectionTemplateId"),
						 new Object [] { hospitalCourseSection }));
			}
			return false;
		}
		return true;
	}

} // HospitalCourseSectionOperations