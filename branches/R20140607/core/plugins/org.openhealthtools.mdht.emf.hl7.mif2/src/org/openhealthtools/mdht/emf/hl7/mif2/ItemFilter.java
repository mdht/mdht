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
 * A representation of the model object '<em><b>Item Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter#getFilterType <em>Filter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getItemFilter()
 * @model extendedMetaData="name='ItemFilter' kind='empty'"
 * @generated
 */
public interface ItemFilter extends PackageOrArtifactRef {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies an x-path filter to be applied against the context of the selected elements to determine whether they are to be included/excluded.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getItemFilter_Expression()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.FilterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the specified element should be included or excluded
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FilterKind
	 * @see #isSetFilterType()
	 * @see #unsetFilterType()
	 * @see #setFilterType(FilterKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getItemFilter_FilterType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='filterType'"
	 * @generated
	 */
	FilterKind getFilterType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FilterKind
	 * @see #isSetFilterType()
	 * @see #unsetFilterType()
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(FilterKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterType()
	 * @see #getFilterType()
	 * @see #setFilterType(FilterKind)
	 * @generated
	 */
	void unsetFilterType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter#getFilterType <em>Filter Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Type</em>' attribute is set.
	 * @see #unsetFilterType()
	 * @see #getFilterType()
	 * @see #setFilterType(FilterKind)
	 * @generated
	 */
	boolean isSetFilterType();

} // ItemFilter
