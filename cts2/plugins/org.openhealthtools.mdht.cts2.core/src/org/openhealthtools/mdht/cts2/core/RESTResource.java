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
package org.openhealthtools.mdht.cts2.core;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Resource</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The header information for any REST resource retrieval
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.RESTResource#getResourceRoot <em>Resource Root</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.RESTResource#getResourceURI <em>Resource URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.RESTResource#getParameter <em>Parameter</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.RESTResource#getAccessDate <em>Access Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getRESTResource()
 * @model extendedMetaData="name='RESTResource' kind='elementOnly'"
 * @generated
 */
public interface RESTResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the REST service. As an example, if the resource URI
	 * was "http://informatics.mayo.edu/cts2/rest/codesystems", the resourceRoot would be
	 * "http://informatics.mayo.edu/cts2/rest/"
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource Root</em>' attribute.
	 * @see #setResourceRoot(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getRESTResource_ResourceRoot()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ServiceURI" required="true"
	 *        extendedMetaData="kind='element' name='resourceRoot' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceRoot();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getResourceRoot <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resource Root</em>' attribute.
	 * @see #getResourceRoot()
	 * @generated
	 */
	void setResourceRoot(String value);

	/**
	 * Returns the value of the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">relative</i> URI of the resource with respect to the resourceRoot. As an example,
	 * if the resource URI was "http://informatics.mayo.edu/cts2/rest/codesystems", the resourceURI would
	 * be "codesystems". Fragment and query identifiers should also be included.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource URI</em>' attribute.
	 * @see #setResourceURI(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getRESTResource_ResourceURI()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI" required="true"
	 *        extendedMetaData="kind='element' name='resourceURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getResourceURI <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resource URI</em>' attribute.
	 * @see #getResourceURI()
	 * @generated
	 */
	void setResourceURI(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The paramaters that were used in executing the query. This carries all of the parameters that
	 * are needed to reconstruct the complete query in either a RESTful or procedural environment. The service provider
	 * may or may not include non-CTS2 related parameters such as security tokens, routing requests, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getRESTResource_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Access Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that the resource was accessed.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Access Date</em>' attribute.
	 * @see #setAccessDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getRESTResource_AccessDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime" required="true"
	 *        extendedMetaData="kind='element' name='accessDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAccessDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.RESTResource#getAccessDate <em>Access Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Access Date</em>' attribute.
	 * @see #getAccessDate()
	 * @generated
	 */
	void setAccessDate(XMLGregorianCalendar value);

} // RESTResource
