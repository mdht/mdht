/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.Directory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry List</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An iterable collection of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSet">ValueSetCatalogEntries.</i>
 * 
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntryList()
 * @model extendedMetaData="name='ValueSetCatalogEntryList' kind='elementOnly'"
 * @generated
 */
public interface ValueSetCatalogEntryList extends Directory {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntryList_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetCatalogEntryListEntry> getEntry();

} // ValueSetCatalogEntryList
