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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Version Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * information about the source, format, release date, version identifier, etc. of a specific version of an abstract resource
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getSourceAndNotation <em>Source And Notation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getPredecessor <em>Predecessor</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialResourceVersionId <em>Official Resource Version Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialReleaseDate <em>Official Release Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialActivationDate <em>Official Activation Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getDocumentURI <em>Document URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription()
 * @model abstract="true"
 *        extendedMetaData="name='ResourceVersionDescription' kind='elementOnly'"
 * @generated
 */
public interface ResourceVersionDescription extends ResourceDescription {
	/**
	 * Returns the value of the '<em><b>Source And Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a description of where the (or a) source of the version may be found, what format and language it is available in, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source And Notation</em>' containment reference.
	 * @see #setSourceAndNotation(SourceAndNotation)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_SourceAndNotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceAndNotation' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceAndNotation getSourceAndNotation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getSourceAndNotation <em>Source And Notation</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source And Notation</em>' containment reference.
	 * @see #getSourceAndNotation()
	 * @generated
	 */
	void setSourceAndNotation(SourceAndNotation value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the name and URI version of the resource from which this current version is derived - the version of the resource that
	 * immediately preceded it
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predecessor</em>' containment reference.
	 * @see #setPredecessor(NameAndMeaningReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_Predecessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predecessor' namespace='##targetNamespace'"
	 * @generated
	 */
	NameAndMeaningReference getPredecessor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getPredecessor <em>Predecessor</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predecessor</em>' containment reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(NameAndMeaningReference value);

	/**
	 * Returns the value of the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an official label or identifier that was assigned to this version by its publisher
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Official Resource Version Id</em>' attribute.
	 * @see #setOfficialResourceVersionId(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_OfficialResourceVersionId()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='officialResourceVersionId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOfficialResourceVersionId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialResourceVersionId
	 * <em>Official Resource Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Official Resource Version Id</em>' attribute.
	 * @see #getOfficialResourceVersionId()
	 * @generated
	 */
	void setOfficialResourceVersionId(String value);

	/**
	 * Returns the value of the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date that this version of the resource officially became available
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Official Release Date</em>' attribute.
	 * @see #setOfficialReleaseDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_OfficialReleaseDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime"
	 *        extendedMetaData="kind='element' name='officialReleaseDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOfficialReleaseDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialReleaseDate
	 * <em>Official Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Official Release Date</em>' attribute.
	 * @see #getOfficialReleaseDate()
	 * @generated
	 */
	void setOfficialReleaseDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Official Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date that this version of the resource is stated by its publishers to go into effect
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Official Activation Date</em>' attribute.
	 * @see #setOfficialActivationDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_OfficialActivationDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime"
	 *        extendedMetaData="kind='element' name='officialActivationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOfficialActivationDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getOfficialActivationDate
	 * <em>Official Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Official Activation Date</em>' attribute.
	 * @see #getOfficialActivationDate()
	 * @generated
	 */
	void setOfficialActivationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that identifies the specific version, language and notation of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">about</i>
	 * resource. This URI needs to be constructed in such a way that, if necessary, it will be possible to
	 * differentiate resource versions that were loaded from different document syntaxes. As an example, if an image of a the wine ontology was loaded
	 * from a resource that was in Manchester Syntax, it should be given a
	 * different URI than the image loaded from the RDF/XML syntax. The reasoning behind this is, even in cases where different syntaxes are 100%
	 * compatible the transformation into the CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> model may not be
	 * identical.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Document URI</em>' attribute.
	 * @see #setDocumentURI(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_DocumentURI()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DocumentURI" required="true"
	 *        extendedMetaData="kind='attribute' name='documentURI'"
	 * @generated
	 */
	String getDocumentURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getDocumentURI <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Document URI</em>' attribute.
	 * @see #getDocumentURI()
	 * @generated
	 */
	void setDocumentURI(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"FINAL"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.FinalizableState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(FinalizableState)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescription_State()
	 * @model default="FINAL" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='state'"
	 * @generated
	 */
	FinalizableState getState();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(FinalizableState value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(FinalizableState)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription#getState <em>State</em>}' attribute is
	 * set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(FinalizableState)
	 * @generated
	 */
	boolean isSetState();

} // ResourceVersionDescription
