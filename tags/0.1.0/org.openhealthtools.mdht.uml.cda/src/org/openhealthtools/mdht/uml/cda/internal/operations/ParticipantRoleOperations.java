/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Participant Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ParticipantRole#playingEntityChoice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Playing Entity Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantRoleOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantRoleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #playingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Playing Entity Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #playingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingDevice.oclIsUndefined() or self.playingEntity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #playingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Playing Entity Choice</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #playingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingDevice.oclIsUndefined() or self.playingEntity.oclIsUndefined()
	 * @param participantRole The receiving '<em><b>Participant Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean playingEntityChoice(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getParticipantRole());
			try {
				PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(participantRole)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.PARTICIPANT_ROLE__PLAYING_ENTITY_CHOICE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "playingEntityChoice", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(participantRole, context) }),
						 new Object [] { participantRole }));
			}
			return false;
		}
		return true;
	}

} // ParticipantRoleOperations