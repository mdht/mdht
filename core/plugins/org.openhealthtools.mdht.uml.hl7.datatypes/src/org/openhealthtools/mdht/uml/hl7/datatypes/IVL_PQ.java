/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVL PQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getLow <em>Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getCenter <em>Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getHigh <em>High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVL_PQ()
 * @model
 * @generated
 */
public interface IVL_PQ extends SXCM_PQ {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(IVXB_PQ)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVL_PQ_Low()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	IVXB_PQ getLow();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(IVXB_PQ value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' containment reference.
	 * @see #setCenter(PQ)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVL_PQ_Center()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	PQ getCenter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getCenter <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' containment reference.
	 * @see #getCenter()
	 * @generated
	 */
    void setCenter(PQ value);

    /**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(IVXB_PQ)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVL_PQ_High()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	IVXB_PQ getHigh();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(IVXB_PQ value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(PQ)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVL_PQ_Width()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	PQ getWidth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(PQ value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.low.oclIsUndefined() implies self.center.oclIsUndefined() and (self.width.oclIsUndefined() or self.high.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.low.oclIsUndefined() implies self.center.oclIsUndefined() and (self.width.oclIsUndefined() or self.high.oclIsUndefined())'"
	 * @generated
	 */
    boolean validateOptionsContainingLow(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.center.oclIsUndefined() implies self.high.oclIsUndefined() and self.low.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.center.oclIsUndefined() implies self.high.oclIsUndefined() and self.low.oclIsUndefined()'"
	 * @generated
	 */
    boolean validateOptionsContainingCenter(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.high.oclIsUndefined() implies (self.low.oclIsUndefined() and self.center.oclIsUndefined() and self.width.oclIsUndefined()) or ((not self.low.oclIsUndefined()) and self.width.oclIsUndefined() and self.center.oclIsUndefined()) or ((not self.width.oclIsUndefined()) and self.low.oclIsUndefined() and self.center.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.high.oclIsUndefined() implies (self.low.oclIsUndefined() and self.center.oclIsUndefined() and self.width.oclIsUndefined()) or ((not self.low.oclIsUndefined()) and self.width.oclIsUndefined() and self.center.oclIsUndefined()) or ((not self.width.oclIsUndefined()) and self.low.oclIsUndefined() and self.center.oclIsUndefined())'"
	 * @generated
	 */
    boolean validateOptionsContainingHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.width.oclIsUndefined() implies ((not self.low.oclIsUndefined()) and self.center.oclIsUndefined() and self.high.oclIsUndefined()) or (self.low.oclIsUndefined() and self.center.oclIsUndefined()) or ((not self.center.oclIsUndefined()) and self.low.oclIsUndefined() and self.high.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.width.oclIsUndefined() implies ((not self.low.oclIsUndefined()) and self.center.oclIsUndefined() and self.high.oclIsUndefined()) or (self.low.oclIsUndefined() and self.center.oclIsUndefined()) or ((not self.center.oclIsUndefined()) and self.low.oclIsUndefined() and self.high.oclIsUndefined())'"
	 * @generated
	 */
    boolean validateOptionsContainingWidth(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IVL_PQ
