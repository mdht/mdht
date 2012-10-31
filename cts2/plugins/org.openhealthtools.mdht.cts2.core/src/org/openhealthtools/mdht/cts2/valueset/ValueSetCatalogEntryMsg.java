/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset;

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSet">ValueSetDefinition</i> read from a service instance.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg#getValueSetCatalogEntry <em>Value Set Catalog Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntryMsg()
 * @model extendedMetaData="name='ValueSetCatalogEntryMsg' kind='elementOnly'"
 * @generated
 */
public interface ValueSetCatalogEntryMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Value Set Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Catalog Entry</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Catalog Entry</em>' containment reference.
	 * @see #setValueSetCatalogEntry(ValueSetCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntryMsg_ValueSetCatalogEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueSetCatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCatalogEntry getValueSetCatalogEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg#getValueSetCatalogEntry
	 * <em>Value Set Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Catalog Entry</em>' containment reference.
	 * @see #getValueSetCatalogEntry()
	 * @generated
	 */
	void setValueSetCatalogEntry(ValueSetCatalogEntry value);

} // ValueSetCatalogEntryMsg
