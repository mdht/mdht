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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemEntryOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemEntryImpl extends ProblemObservationImpl implements ProblemEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PROBLEM_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryCommentInversionInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryCommentInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntrySeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntrySeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryHealthStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryHealthStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntryComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemEntryOperations.validateProblemEntryComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return ProblemEntryOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getProblemStatusObservation() {
		return ProblemEntryOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation getHealthStatusObservation() {
		return ProblemEntryOperations.getHealthStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		return ProblemEntryOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ProblemEntryImpl
