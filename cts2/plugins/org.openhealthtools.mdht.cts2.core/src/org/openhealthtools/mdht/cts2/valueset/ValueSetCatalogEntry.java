/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset;

import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An entry in a value set catalog that describes the purpose, use, etc. of a value set.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getDefinitions <em>Definitions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getCurrentDefinition <em>Current Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getValueSetName <em>Value Set Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntry()
 * @model extendedMetaData="name='ValueSetCatalogEntry' kind='elementOnly'"
 * @generated
 */
public interface ValueSetCatalogEntry extends AbstractResourceDescription {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSet">DirectoryURI </i>that references a set of definition (versions) for this value set.
	 * If the service profile does not support value set definitions, this attribute should be omitted. If the
	 * service supports definitions but none are known for this value set, the parameter should be supplied, but will resolve to an empty directory.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Definitions</em>' attribute.
	 * @see #setDefinitions(String)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntry_Definitions()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ValueSetDefinitionDirectoryURI"
	 *        extendedMetaData="kind='element' name='definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefinitions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getDefinitions <em>Definitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Definitions</em>' attribute.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(String value);

	/**
	 * Returns the value of the '<em><b>Current Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the definition associated with the CURRENT tag, if any
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Current Definition</em>' containment reference.
	 * @see #setCurrentDefinition(ValueSetDefinitionReference)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntry_CurrentDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionReference getCurrentDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getCurrentDefinition <em>Current Definition</em>}'
	 * containment reference.
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
	 * the unique name of this value set within the context of the CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSet">2</sub> service
	 * instance.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set Name</em>' attribute.
	 * @see #setValueSetName(String)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getValueSetCatalogEntry_ValueSetName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ValueSetName" required="true"
	 *        extendedMetaData="kind='attribute' name='valueSetName'"
	 * @generated
	 */
	String getValueSetName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry#getValueSetName <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Name</em>' attribute.
	 * @see #getValueSetName()
	 * @generated
	 */
	void setValueSetName(String value);

} // ValueSetCatalogEntry
