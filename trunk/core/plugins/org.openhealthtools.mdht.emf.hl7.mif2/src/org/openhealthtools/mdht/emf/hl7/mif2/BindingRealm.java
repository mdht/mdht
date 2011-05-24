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

import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a particular binding realm
 * UML: A stereotype on EnumerationItem.  (The enumeration itself is implicit)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getOwningAffiliate <em>Owning Affiliate</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBindingRealm()
 * @model extendedMetaData="name='BindingRealm' kind='elementOnly'"
 * @generated
 */
public interface BindingRealm extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the purpose and scope of the binding realm
	 * UML: ModelElement.Comment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Inline)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBindingRealm_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Inline getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Inline value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal name for the binding realm
	 * UML: EnumerationItem.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBindingRealm_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.EnumerationToken" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Affiliate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.AffiliateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The affiliate responsible for the binding realm
	 * UML: Tag on BindingRealm stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Affiliate</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AffiliateKind
	 * @see #isSetOwningAffiliate()
	 * @see #unsetOwningAffiliate()
	 * @see #setOwningAffiliate(AffiliateKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBindingRealm_OwningAffiliate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='owningAffiliate'"
	 * @generated
	 */
	AffiliateKind getOwningAffiliate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getOwningAffiliate <em>Owning Affiliate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Affiliate</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AffiliateKind
	 * @see #isSetOwningAffiliate()
	 * @see #unsetOwningAffiliate()
	 * @see #getOwningAffiliate()
	 * @generated
	 */
	void setOwningAffiliate(AffiliateKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getOwningAffiliate <em>Owning Affiliate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwningAffiliate()
	 * @see #getOwningAffiliate()
	 * @see #setOwningAffiliate(AffiliateKind)
	 * @generated
	 */
	void unsetOwningAffiliate();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getOwningAffiliate <em>Owning Affiliate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owning Affiliate</em>' attribute is set.
	 * @see #unsetOwningAffiliate()
	 * @see #getOwningAffiliate()
	 * @see #setOwningAffiliate(AffiliateKind)
	 * @generated
	 */
	boolean isSetOwningAffiliate();

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBindingRealm_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // BindingRealm
