/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Criterion</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The particular attribute, property or special element to be sorted along with the sort direction
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortElement <em>Sort Element</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getEntryOrder <em>Entry Order</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortDirection <em>Sort Direction</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSortCriterion()
 * @model extendedMetaData="name='SortCriterion' kind='elementOnly'"
 * @generated
 */
public interface SortCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the type and name of the attribute, property or special element to be sorted
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Sort Element</em>' containment reference.
	 * @see #setSortElement(PropertyReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSortCriterion_SortElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sortElement' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyReference getSortElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortElement <em>Sort Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sort Element</em>' containment reference.
	 * @see #getSortElement()
	 * @generated
	 */
	void setSortElement(PropertyReference value);

	/**
	 * Returns the value of the '<em><b>Entry Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Order</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry Order</em>' attribute.
	 * @see #setEntryOrder(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSortCriterion_EntryOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='entryOrder'"
	 * @generated
	 */
	BigInteger getEntryOrder();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getEntryOrder <em>Entry Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entry Order</em>' attribute.
	 * @see #getEntryOrder()
	 * @generated
	 */
	void setEntryOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Sort Direction</b></em>' attribute.
	 * The default value is <code>"ASCENDING"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.SortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the sort order
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Sort Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.SortDirection
	 * @see #isSetSortDirection()
	 * @see #unsetSortDirection()
	 * @see #setSortDirection(SortDirection)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSortCriterion_SortDirection()
	 * @model default="ASCENDING" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sortDirection'"
	 * @generated
	 */
	SortDirection getSortDirection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortDirection <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sort Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.SortDirection
	 * @see #isSetSortDirection()
	 * @see #unsetSortDirection()
	 * @see #getSortDirection()
	 * @generated
	 */
	void setSortDirection(SortDirection value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortDirection <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetSortDirection()
	 * @see #getSortDirection()
	 * @see #setSortDirection(SortDirection)
	 * @generated
	 */
	void unsetSortDirection();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.SortCriterion#getSortDirection <em>Sort Direction</em>}' attribute
	 * is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Sort Direction</em>' attribute is set.
	 * @see #unsetSortDirection()
	 * @see #getSortDirection()
	 * @see #setSortDirection(SortDirection)
	 * @generated
	 */
	boolean isSetSortDirection();

} // SortCriterion
