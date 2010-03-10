/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ncr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersActivityOperations;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPlugin;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity;
import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neonatal ICU Encounter Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity#validateNeonatalICUEncounterActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeonatalICUEncounterActivityOperations extends EncountersActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeonatalICUEncounterActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityLocation(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityLocation(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | participant.typeCode=vocab::ParticipationType::LOC and participant.oclIsKindOf(ncr::NeonatalICULocation))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityLocation(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityLocation(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | participant.typeCode=vocab::ParticipationType::LOC and participant.oclIsKindOf(ncr::NeonatalICULocation))
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityLocation(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_LOCATION,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityLocation"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityTemplateId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityTemplateId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.3.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityTemplateId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityTemplateId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.3.15')
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityTemplateId(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_TEMPLATE_ID,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityTemplateId"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityClassCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityClassCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::ENC";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityClassCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityClassCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClass::ENC
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityClassCode(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_CLASS_CODE,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityClassCode"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityMoodCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityMoodCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentEncounterMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityMoodCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityMoodCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentEncounterMood::EVN
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityMoodCode(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_MOOD_CODE,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityMoodCode"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'IMP' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityCode(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'IMP' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityCode(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_CODE,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityCode"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityEffectiveTime(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityEffectiveTime(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityEffectiveTime(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityEffectiveTime(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityEffectiveTime(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_EFFECTIVE_TIME,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityEffectiveTime"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeonatalICUEncounterActivityId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateNeonatalICUEncounterActivityId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neonatal ICU Encounter Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeonatalICUEncounterActivityId(NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param neonatalICUEncounterActivity The receiving '<em><b>Neonatal ICU Encounter Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateNeonatalICUEncounterActivityId(NeonatalICUEncounterActivity neonatalICUEncounterActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY);
			try {
				VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(neonatalICUEncounterActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.NEONATAL_ICU_ENCOUNTER_ACTIVITY__NEONATAL_ICU_ENCOUNTER_ACTIVITY_ID,
						 NCRPlugin.INSTANCE.getString("NeonatalICUEncounterActivityId"),
						 new Object [] { neonatalICUEncounterActivity }));
			}
			return false;
		}
		return true;
	}

} // NeonatalICUEncounterActivityOperations