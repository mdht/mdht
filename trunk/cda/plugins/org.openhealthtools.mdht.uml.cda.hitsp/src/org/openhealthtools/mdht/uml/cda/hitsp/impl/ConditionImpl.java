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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HitspPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemConcernEntryImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends ProblemConcernEntryImpl implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HitspPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Condition_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.Condition_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Condition_text(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionOperations.Condition_text(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry createProblemEntry() {
		return ConditionOperations.createProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ConditionImpl
