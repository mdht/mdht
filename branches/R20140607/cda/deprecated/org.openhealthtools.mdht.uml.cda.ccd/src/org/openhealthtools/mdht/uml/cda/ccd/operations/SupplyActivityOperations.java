/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SupplyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Supply Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasParticipantLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Participant Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#validateSupplyActivityFulfillmentInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Fulfillment Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity#getFulfillmentInstructions() <em>Get Fulfillment Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplyActivityOperations extends SupplyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityMoodCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityMoodCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityMoodCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityMoodCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityMoodCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("SupplyActivityMoodCode"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityHasAuthor(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasAuthor(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityHasAuthor(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasAuthor(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityHasAuthor(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_HAS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_AUTHOR,
						 CCDPlugin.INSTANCE.getString("SupplyActivityHasAuthor"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityHasPerformer(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasPerformer(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.performer->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityHasPerformer(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasPerformer(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.performer->isEmpty()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityHasPerformer(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_HAS_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PERFORMER,
						 CCDPlugin.INSTANCE.getString("SupplyActivityHasPerformer"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityHasParticipantLocation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Participant Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasParticipantLocation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::LOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityHasParticipantLocation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Participant Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasParticipantLocation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(part : cda::Participant2 | part.typeCode = vocab::ParticipationType::LOC)
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityHasParticipantLocation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION,
						 CCDPlugin.INSTANCE.getString("SupplyActivityHasParticipantLocation"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityInformationSource(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityInformationSource(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityInformationSource(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityInformationSource(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityInformationSource(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_INFORMATION_SOURCE,
						 CCDPlugin.INSTANCE.getString("SupplyActivityInformationSource"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityHasProduct(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasProduct(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.product.oclIsUndefined() and self.product.oclIsKindOf(ccd::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityHasProduct(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityHasProduct(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.product.oclIsUndefined() and self.product.oclIsKindOf(ccd::Product)
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityHasProduct(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PRODUCT,
						 CCDPlugin.INSTANCE.getString("SupplyActivityHasProduct"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityTemplateId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.34')
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityTemplateId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("SupplyActivityTemplateId"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityId(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("SupplyActivityId"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityStatusCode(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityStatusCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("SupplyActivityStatusCode"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityEffectiveTime(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityEffectiveTime(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityEffectiveTime(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityEffectiveTime(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime->size() = 1
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityEffectiveTime(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("SupplyActivityEffectiveTime"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityQuantity(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityQuantity(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.quantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityQuantity(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityQuantity(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.quantity.oclIsUndefined()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityQuantity(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_QUANTITY,
						 CCDPlugin.INSTANCE.getString("SupplyActivityQuantity"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityRepeatNumber(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityRepeatNumber(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.repeatNumber.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityRepeatNumber(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityRepeatNumber(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.repeatNumber.oclIsUndefined()
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityRepeatNumber(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_REPEAT_NUMBER,
						 CCDPlugin.INSTANCE.getString("SupplyActivityRepeatNumber"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityMedicationStatusObservation(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityMedicationStatusObservation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("SupplyActivityMedicationStatusObservation"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Fulfillment Instruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::FulfillmentInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Activity Fulfillment Instruction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupplyActivityFulfillmentInstruction(SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::FulfillmentInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupplyActivityFulfillmentInstruction(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.SUPPLY_ACTIVITY);
			try {
				VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supplyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION,
						 CCDPlugin.INSTANCE.getString("SupplyActivityFulfillmentInstruction"),
						 new Object [] { supplyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(SupplyActivity) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(SupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationStatusObservation))->asSequence()->first().oclAsType(ccd::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(SupplyActivity) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(SupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationStatusObservation))->asSequence()->first().oclAsType(ccd::MedicationStatusObservation)
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationStatusObservation getMedicationStatusObservation(SupplyActivity supplyActivity) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.SUPPLY_ACTIVITY, CCDPackage.Literals.SUPPLY_ACTIVITY.getEAllOperations().get(57));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(supplyActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFulfillmentInstructions(SupplyActivity) <em>Get Fulfillment Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentInstructions(SupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FULFILLMENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::FulfillmentInstruction)).oclAsType(ccd::FulfillmentInstruction)";

	/**
	 * The cached OCL query for the '{@link #getFulfillmentInstructions(SupplyActivity) <em>Get Fulfillment Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentInstructions(SupplyActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FULFILLMENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::FulfillmentInstruction)).oclAsType(ccd::FulfillmentInstruction)
	 * @param supplyActivity The receiving '<em><b>Supply Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<FulfillmentInstruction> getFulfillmentInstructions(SupplyActivity supplyActivity) {
		if (GET_FULFILLMENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.SUPPLY_ACTIVITY, CCDPackage.Literals.SUPPLY_ACTIVITY.getEAllOperations().get(58));
			try {
				GET_FULFILLMENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_FULFILLMENT_INSTRUCTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FULFILLMENT_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FulfillmentInstruction> result = (Collection<FulfillmentInstruction>) query.evaluate(supplyActivity);
		return new BasicEList.UnmodifiableEList<FulfillmentInstruction>(result.size(), result.toArray());
	}

} // SupplyActivityOperations