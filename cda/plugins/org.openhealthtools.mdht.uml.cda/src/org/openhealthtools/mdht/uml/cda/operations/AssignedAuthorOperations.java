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
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.AssignedAuthor#validateAssignedAuthorChoice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedAuthorOperations {
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
	protected AssignedAuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedAuthorChoice(AssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthorChoice(AssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_AUTHOR_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedPerson.oclIsUndefined() or self.assignedAuthoringDevice.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedAuthorChoice(AssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Choice</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedAuthorChoice(AssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_AUTHOR_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedPerson.oclIsUndefined() or self.assignedAuthoringDevice.oclIsUndefined()
	 * @param assignedAuthor The receiving '<em><b>Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAssignedAuthorChoice(AssignedAuthor assignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_AUTHOR_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.ASSIGNED_AUTHOR);
			try {
				VALIDATE_ASSIGNED_AUTHOR_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_AUTHOR_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_AUTHOR_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.ASSIGNED_AUTHOR__ASSIGNED_AUTHOR_CHOICE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAssignedAuthorChoice", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assignedAuthor, context) }),
						 new Object [] { assignedAuthor }));
			}
			return false;
		}
		return true;
	}

} // AssignedAuthorOperations