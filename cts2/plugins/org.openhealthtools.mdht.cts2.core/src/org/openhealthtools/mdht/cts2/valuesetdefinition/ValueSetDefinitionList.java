/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.Directory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A collection of complete <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ValueSetDefinition </i> resources that meet a specified
 * criteria.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionList()
 * @model extendedMetaData="name='ValueSetDefinitionList' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefinitionList extends Directory {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionList_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetDefinitionListEntry> getEntry();

} // ValueSetDefinitionList
