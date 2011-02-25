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
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.STOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class STImpl extends EDImpl implements ST {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.ST;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateThumbnail(DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return STOperations.validateThumbnail(this, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateReference(DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return STOperations.validateReference(this, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIntegrityCheck(DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return STOperations.validateIntegrityCheck(this, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompression(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STOperations.validateCompression(this, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STOperations.validateRepresentation(this, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompressionDefined() {
		return STOperations.isCompressionDefined(this);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntegrityCheckAlgorithmDefined() {
		return STOperations.isIntegrityCheckAlgorithmDefined(this);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentationDefined() {
		return STOperations.isRepresentationDefined(this);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegrityCheckAlgorithm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STOperations.validateIntegrityCheckAlgorithm(this, diagnostics, context);
	}

} //STImpl
