/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valueset;

import org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Summary</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A synopsis of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSet">ValueSet</i> along with information about how to access the complete
 * resource.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getCurrentDefinition <em>Current Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getValueSetName <em>Value Set Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntrySummary()
 * @model extendedMetaData="name='ValueSetCatalogEntrySummary' kind='elementOnly'"
 * @generated
 */
public interface ValueSetCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Current Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name and URI of the value set definition that is associated with the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSet">CURRENT</i>
	 * tag for this value set.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Current Definition</em>' containment reference.
	 * @see #setCurrentDefinition(ValueSetDefinitionReference)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntrySummary_CurrentDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionReference getCurrentDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getCurrentDefinition
	 * <em>Current Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Current Definition</em>' containment reference.
	 * @see #getCurrentDefinition()
	 * @generated
	 */
	void setCurrentDefinition(ValueSetDefinitionReference value);

	/**
	 * Returns the value of the '<em><b>Value Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local identifier assigned to the value set within the context of the service
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set Name</em>' attribute.
	 * @see #setValueSetName(String)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntrySummary_ValueSetName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ValueSetName" required="true"
	 *        extendedMetaData="kind='attribute' name='valueSetName'"
	 * @generated
	 */
	String getValueSetName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary#getValueSetName <em>Value Set Name</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Name</em>' attribute.
	 * @see #getValueSetName()
	 * @generated
	 */
	void setValueSetName(String value);

} // ValueSetCatalogEntrySummary
