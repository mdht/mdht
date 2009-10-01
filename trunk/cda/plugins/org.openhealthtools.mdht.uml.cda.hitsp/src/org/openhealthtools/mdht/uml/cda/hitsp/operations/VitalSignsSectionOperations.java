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
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection#HITSPVitalSignsSection_vitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>HITSP Vital Signs Section vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection#VitalSignsSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Vital Signs Section template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionOperations extends CodedVitalSignsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #HITSPVitalSignsSection_vitalSigns(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>HITSP Vital Signs Section vital Signs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HITSPVitalSignsSection_vitalSigns(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ihe::IHEVitalSignsOrganizer) and"+
"entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(hitsp::VitalSign)))";

	/**
	 * The cached OCL invariant for the '{@link #HITSPVitalSignsSection_vitalSigns(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>HITSP Vital Signs Section vital Signs</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HITSPVitalSignsSection_vitalSigns(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ihe::IHEVitalSignsOrganizer) and
	 * entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(hitsp::VitalSign)))
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean HITSPVitalSignsSection_vitalSigns(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS,
						 HITSPPlugin.INSTANCE.getString("HITSPVitalSignsSection_vitalSigns"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #VitalSignsSection_templateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Vital Signs Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VitalSignsSection_templateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.83.119')";

	/**
	 * The cached OCL invariant for the '{@link #VitalSignsSection_templateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Vital Signs Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VitalSignsSection_templateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.119')
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean VitalSignsSection_templateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("VitalSignsSection_templateId"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

} // VitalSignsSectionOperations