/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection#validateVitalSignsSectionClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection#validateVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection#validateVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection#validateVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection#validateVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection#getVitalSignsOrganizer() <em>Get Vital Signs Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionClinicalStatements(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Clinical Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionClinicalStatements(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionClinicalStatements(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Clinical Statements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionClinicalStatements(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->isEmpty()
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionClinicalStatements(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS,
						 CDTPlugin.INSTANCE.getString("VitalSignsSectionClinicalStatements"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.4')
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("VitalSignsSectionTemplateId"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionCode(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE,
						 CDTPlugin.INSTANCE.getString("VitalSignsSectionCode"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionText(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT,
						 CDTPlugin.INSTANCE.getString("VitalSignsSectionText"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Vital Signs Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(ccd::VitalSignsOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Vital Signs Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(ccd::VitalSignsOrganizer))
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER,
						 CDTPlugin.INSTANCE.getString("VitalSignsSectionVitalSignsOrganizer"),
						 new Object [] { vitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsOrganizer(VitalSignsSection) <em>Get Vital Signs Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizer(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(ccd::VitalSignsOrganizer))->asSequence()->first().oclAsType(ccd::VitalSignsOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsOrganizer(VitalSignsSection) <em>Get Vital Signs Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizer(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(ccd::VitalSignsOrganizer))->asSequence()->first().oclAsType(ccd::VitalSignsOrganizer)
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  VitalSignsOrganizer getVitalSignsOrganizer(VitalSignsSection vitalSignsSection) {
		if (GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.VITAL_SIGNS_SECTION, CDTPackage.Literals.VITAL_SIGNS_SECTION.getEAllOperations().get(52));
			try {
				GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_ORGANIZER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY);
		return (VitalSignsOrganizer) query.evaluate(vitalSignsSection);
	}

} // VitalSignsSectionOperations