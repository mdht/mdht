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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a parameter and the static model it is bound to.
 * UML: TemplateArgument
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel#getTraversalName <em>Traversal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getParameterModel()
 * @model extendedMetaData="name='ParameterModel' kind='elementOnly'"
 * @generated
 */
public interface ParameterModel extends BoundStaticModel {
	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For specializations that are choices or CMETs whose root is a choice, identifies the classes within the choice and the association names tied to those classes.
	 * UML: Identifies classes that specialize this generalized class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getParameterModel_Specialization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssociationEndSpecialization> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the stub parameter being bound
	 * UML: Name of the Parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getParameterModel_ParameterName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='parameterName'"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Traversal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the element when traversing from the association end directly to this specialized class
	 * UML: tagged element on the specialized class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traversal Name</em>' attribute.
	 * @see #setTraversalName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getParameterModel_TraversalName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName"
	 *        extendedMetaData="kind='attribute' name='traversalName'"
	 * @generated
	 */
	String getTraversalName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel#getTraversalName <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Name</em>' attribute.
	 * @see #getTraversalName()
	 * @generated
	 */
	void setTraversalName(String value);

} // ParameterModel
