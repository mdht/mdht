/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection#validateHITSPImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunizations Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection#validateHITSPImmunizationsSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunizations Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection#getHITSPImmunizations() <em>Get HITSP Immunizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationsSectionOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.ImmunizationsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPImmunizationsSectionTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunizations Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationsSectionTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.117')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPImmunizationsSectionTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunizations Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationsSectionTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.117')
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPImmunizationsSectionTemplateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID,
						 HITSPPlugin.INSTANCE.getString("HITSPImmunizationsSectionTemplateId"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunizations Section Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hitsp::Immunization))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunizations Section Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hitsp::Immunization))
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHITSPImmunizationsSectionImmunization(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION,
						 HITSPPlugin.INSTANCE.getString("HITSPImmunizationsSectionImmunization"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHITSPImmunizations(ImmunizationsSection) <em>Get HITSP Immunizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPImmunizations(ImmunizationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HITSP_IMMUNIZATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hitsp::Immunization)).oclAsType(hitsp::Immunization)";

	/**
	 * The cached OCL query for the '{@link #getHITSPImmunizations(ImmunizationsSection) <em>Get HITSP Immunizations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHITSPImmunizations(ImmunizationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HITSP_IMMUNIZATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hitsp::Immunization)).oclAsType(hitsp::Immunization)
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Immunization> getHITSPImmunizations(ImmunizationsSection immunizationsSection) {
		if (GET_HITSP_IMMUNIZATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HITSPPackage.Literals.IMMUNIZATIONS_SECTION, HITSPPackage.Literals.IMMUNIZATIONS_SECTION.getEAllOperations().get(57));
			try {
				GET_HITSP_IMMUNIZATIONS__EOCL_QRY = helper.createQuery(GET_HITSP_IMMUNIZATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HITSP_IMMUNIZATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Immunization> result = (Collection<Immunization>) query.evaluate(immunizationsSection);
		return new BasicEList.UnmodifiableEList<Immunization>(result.size(), result.toArray());
	}

} // ImmunizationsSectionOperations