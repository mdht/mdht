/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Intolerance Concern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#AllergyIntoleranceConcern_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allergy Intolerance Concern template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceConcernOperations extends ConcernEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceConcernOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #AllergyIntoleranceConcern_templateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allergy Intolerance Concern template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AllergyIntoleranceConcern_templateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.5.3')";

	/**
	 * The cached OCL invariant for the '{@link #AllergyIntoleranceConcern_templateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allergy Intolerance Concern template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AllergyIntoleranceConcern_templateId(AllergyIntoleranceConcern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.5.3')
	 * @param allergyIntoleranceConcern The receiving '<em><b>Allergy Intolerance Concern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AllergyIntoleranceConcern_templateId(AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE_CONCERN);
			try {
				ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntoleranceConcern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AllergyIntoleranceConcern_templateId", ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyIntoleranceConcern, context) }),
						 new Object [] { allergyIntoleranceConcern }));
			}
			return false;
		}
		return true;
	}

} // AllergyIntoleranceConcernOperations