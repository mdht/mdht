/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 */
package org.eclipse.mdht.uml.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getBase_Namespace <em>Base Namespace</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getDiagnosticSource <em>Diagnostic Source</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getCategoryID <em>Category ID</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getCategoryName <em>Category Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getParentCategoryID <em>Parent Category ID</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getBundleName <em>Bundle Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider()
 * @model
 * @generated
 */
public interface ConstraintProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Namespace</em>' reference.
	 * @see #setBase_Namespace(Namespace)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider_Base_Namespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getBase_Namespace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getBase_Namespace <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Namespace</em>' reference.
	 * @see #getBase_Namespace()
	 * @generated
	 */
	void setBase_Namespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostic Source</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Diagnostic Source</em>' attribute.
	 * @see #setDiagnosticSource(String)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider_DiagnosticSource()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDiagnosticSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getDiagnosticSource <em>Diagnostic Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Diagnostic Source</em>' attribute.
	 * @see #getDiagnosticSource()
	 * @generated
	 */
	void setDiagnosticSource(String value);

	/**
	 * Returns the value of the '<em><b>Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category ID</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Category ID</em>' attribute.
	 * @see #setCategoryID(String)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider_CategoryID()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCategoryID();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getCategoryID <em>Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Category ID</em>' attribute.
	 * @see #getCategoryID()
	 * @generated
	 */
	void setCategoryID(String value);

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider_CategoryName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category ID</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Parent Category ID</em>' attribute.
	 * @see #setParentCategoryID(String)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider_ParentCategoryID()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getParentCategoryID();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getParentCategoryID <em>Parent Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Parent Category ID</em>' attribute.
	 * @see #getParentCategoryID()
	 * @generated
	 */
	void setParentCategoryID(String value);

	/**
	 * Returns the value of the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Bundle Name</em>' attribute.
	 * @see #setBundleName(String)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getConstraintProvider_BundleName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getBundleName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.ConstraintProvider#getBundleName <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Bundle Name</em>' attribute.
	 * @see #getBundleName()
	 * @generated
	 */
	void setBundleName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Diagnostic> getDiagnostics();

} // ConstraintProvider
