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
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Entry Relationship</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.EntryRelationship#clinicalStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryRelationshipOperations {
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
	protected EntryRelationshipOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #clinicalStatement(EntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clinicalStatement(EntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "Bag{self.act.oclIsUndefined(), self.encounter.oclIsUndefined(), self.observation.oclIsUndefined(), self.observationMedia.oclIsUndefined(), self.organizer.oclIsUndefined(), self.procedure.oclIsUndefined(), self.regionOfInterest.oclIsUndefined(), self.substanceAdministration.oclIsUndefined(), self.supply.oclIsUndefined()}->one(x | x = false)";

	/**
	 * The cached OCL invariant for the '{@link #clinicalStatement(EntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Clinical Statement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clinicalStatement(EntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag{self.act.oclIsUndefined(), self.encounter.oclIsUndefined(), self.observation.oclIsUndefined(), self.observationMedia.oclIsUndefined(), self.organizer.oclIsUndefined(), self.procedure.oclIsUndefined(), self.regionOfInterest.oclIsUndefined(), self.substanceAdministration.oclIsUndefined(), self.supply.oclIsUndefined()}->one(x | x = false)
	 * @param entryRelationship The receiving '<em><b>Entry Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean clinicalStatement(EntryRelationship entryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.eINSTANCE.getEntryRelationship());
			try {
				CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CLINICAL_STATEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(entryRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.ENTRY_RELATIONSHIP__CLINICAL_STATEMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "clinicalStatement", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(entryRelationship, context) }),
						 new Object [] { entryRelationship }));
			}
			return false;
		}
		return true;
	}

} // EntryRelationshipOperations