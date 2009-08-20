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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Concern Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entry is a specialization of the Concern Entry, wherein the subject of the concern is focused on a problem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getProblemConcernEntry()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemConcernEntry_templateId ProblemConcernEntry_problemEntry' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.5.2'"
 *        annotation="uml2.alias Problem\040Concern\040Entry='null'"
 * @generated
 */
public interface ProblemConcernEntry extends ConcernEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.5.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.4.5.2\')'"
	 * @generated
	 */
	boolean ProblemConcernEntry_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ihe::ProblemEntry))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ihe::ProblemEntry))'"
	 * @generated
	 */
	boolean ProblemConcernEntry_problemEntry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernEntry init();
} // ProblemConcernEntry
