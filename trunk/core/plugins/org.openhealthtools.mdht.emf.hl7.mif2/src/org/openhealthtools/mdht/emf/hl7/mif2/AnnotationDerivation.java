/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: a Derivation that points to another annotation.  (To make XML handle the graph-like nature of UML)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation#getTargetAnnotationName <em>Target Annotation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationDerivation()
 * @model extendedMetaData="name='AnnotationDerivation' kind='elementOnly'"
 * @generated
 */
public interface AnnotationDerivation extends Derivation {
	/**
	 * Returns the value of the '<em><b>Target Annotation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the annotation from which this annotation was derived.
	 * UML: The name of the Annotation element (inherited from ModelElement) that is being derived from
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Annotation Name</em>' attribute.
	 * @see #setTargetAnnotationName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationDerivation_TargetAnnotationName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='targetAnnotationName'"
	 * @generated
	 */
	String getTargetAnnotationName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation#getTargetAnnotationName <em>Target Annotation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Annotation Name</em>' attribute.
	 * @see #getTargetAnnotationName()
	 * @generated
	 */
	void setTargetAnnotationName(String value);

} // AnnotationDerivation
