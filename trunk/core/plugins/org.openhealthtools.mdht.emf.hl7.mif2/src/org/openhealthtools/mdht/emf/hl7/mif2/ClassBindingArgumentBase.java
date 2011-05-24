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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Binding Argument Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A binding to a parameterized Static Model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgumentBase#getTemplateParameterName <em>Template Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBindingArgumentBase()
 * @model extendedMetaData="name='ClassBindingArgumentBase' kind='empty'"
 * @generated
 */
public interface ClassBindingArgumentBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the argument being bound.
	 * UML: Used to identify which parameter is being bound (because sequence is not used)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter Name</em>' attribute.
	 * @see #setTemplateParameterName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBindingArgumentBase_TemplateParameterName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='templateParameterName'"
	 * @generated
	 */
	String getTemplateParameterName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgumentBase#getTemplateParameterName <em>Template Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter Name</em>' attribute.
	 * @see #getTemplateParameterName()
	 * @generated
	 */
	void setTemplateParameterName(String value);

} // ClassBindingArgumentBase
