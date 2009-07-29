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
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Problems Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getActiveProblemsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.6' code.displayName='PROBLEM LIST' code.codeSystem='2.16.840.1.113883.6.1' code.code='11450-4'"
 *        annotation="uml2.alias Active\040Problems\040Section='null'"
 * @generated
 */
public interface ActiveProblemsSection extends ProblemSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(en : cda::Entry | not en.act.oclIsUndefined() and en.act.oclIsTypeOf(ihe::ProblemConcernEntry))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(en : cda::Entry | not en.act.oclIsUndefined() and en.act.oclIsTypeOf(ihe::ProblemConcernEntry))'"
	 * @generated
	 */
	boolean ActiveProblemsSection_entry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.6')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.3.6\')'"
	 * @generated
	 */
	boolean ActiveProblemsSection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.code = '11450-4' and self.code.codeSystem = '2.16.840.1.113883.6.1' and self.code.codeSystemName = 'LOINC'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.code = \'11450-4\' and self.code.codeSystem = \'2.16.840.1.113883.6.1\' and self.code.codeSystemName = \'LOINC\''"
	 * @generated
	 */
	boolean ActiveProblemsSection_code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveProblemsSection init();
} // ActiveProblemsSection
