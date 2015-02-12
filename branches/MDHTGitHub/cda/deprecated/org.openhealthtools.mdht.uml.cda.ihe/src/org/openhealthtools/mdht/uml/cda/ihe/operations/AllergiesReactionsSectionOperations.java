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
import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertsSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection#validateAllergiesReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesReactionsSectionOperations extends AlertsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesReactionsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Reactions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.13')
	 * @param allergiesReactionsSection The receiving '<em><b>Allergies Reactions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGIES_REACTIONS_SECTION);
			try {
				VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesReactionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("AllergiesReactionsSectionTemplateId"),
						 new Object [] { allergiesReactionsSection }));
			}
			return false;
		}
		return true;
	}

} // AllergiesReactionsSectionOperations