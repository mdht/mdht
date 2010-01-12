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
package org.openhealthtools.mdht.uml.cda.ncr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.EncountersActivityImpl;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity;
import org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neonatal ICU Encounter Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NeonatalICUEncounterActivityImpl extends EncountersActivityImpl implements NeonatalICUEncounterActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeonatalICUEncounterActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NCRPackage.Literals.NEONATAL_ICU_ENCOUNTER_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityLocation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityLocation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeonatalICUEncounterActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NeonatalICUEncounterActivityOperations.validateNeonatalICUEncounterActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeonatalICUEncounterActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //NeonatalICUEncounterActivityImpl
