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
package org.openhealthtools.mdht.cts2.association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An instance of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Association</i> that meets a specified filter criteria.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getHref <em>Href</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getMatchStrength <em>Match Strength</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationListEntry()
 * @model extendedMetaData="name='AssociationListEntry' kind='elementOnly'"
 * @generated
 */
public interface AssociationListEntry extends Association {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">LocalURI </i>that resolves to the full resource described by the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">DirectoryEntry</i>. This should be present if the service either (a) supports the <b
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Read</b> functional profile for the specified
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">type </i>or (b) is aware of another service that does.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationListEntry_Href()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Match Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a relative measure of the "goodness of fit" of the directory entry within the context of the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">directoryFilter</i> in the containing <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Directory.</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Match Strength</em>' attribute.
	 * @see #isSetMatchStrength()
	 * @see #unsetMatchStrength()
	 * @see #setMatchStrength(double)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationListEntry_MatchStrength()
	 * @model unsettable="true" dataType="org.openhealthtools.mdht.cts2.core.MatchStrength"
	 *        extendedMetaData="kind='attribute' name='matchStrength'"
	 * @generated
	 */
	double getMatchStrength();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getMatchStrength <em>Match Strength</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Match Strength</em>' attribute.
	 * @see #isSetMatchStrength()
	 * @see #unsetMatchStrength()
	 * @see #getMatchStrength()
	 * @generated
	 */
	void setMatchStrength(double value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getMatchStrength <em>Match Strength</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetMatchStrength()
	 * @see #getMatchStrength()
	 * @see #setMatchStrength(double)
	 * @generated
	 */
	void unsetMatchStrength();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getMatchStrength
	 * <em>Match Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Match Strength</em>' attribute is set.
	 * @see #unsetMatchStrength()
	 * @see #getMatchStrength()
	 * @see #setMatchStrength(double)
	 * @generated
	 */
	boolean isSetMatchStrength();

	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a local identifier that names a unique resource within the context of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">type</i> and the
	 * service context. This attribute must be present if the corresponding element has a local name. Note, however, that
	 * some elements (e.g. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Association</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ValueSetDefinition</i>, etc.) do not local names and are identified exclusively by their <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">href</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationListEntry_ResourceName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.LocalIdentifier"
	 *        extendedMetaData="kind='attribute' name='resourceName'"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationListEntry#getResourceName <em>Resource Name</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

} // AssociationListEntry
