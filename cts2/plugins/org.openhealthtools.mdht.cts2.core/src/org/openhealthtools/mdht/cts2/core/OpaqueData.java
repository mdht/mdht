/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Data</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Opaque data is the equivalent of an ASN.1 External Type <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">
 * <sub>ISO/IEC 8824-1:2008 Information technology -- Abstract Syntax Notation One (ASN.1): Specification of basic notion. Clause 37 - Notation for
 * the
 * external type</sub>
 * </i> or the XML Schema <a href="//http://www.w3.org/TR/xmlschema-0/\#anyType" xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">anyType</a>. An <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OpaqueData</i> instance may represent text with an optional spoken or written language code or a
 * formal structure such as embedded HTML, XML or MIME encoded data. When a formal structure is included, its type should be specified in the <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">format</i> attribute and, when the type is an XML variant, the corresponding
 * schema (or DTD) should be included in the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">schema</i> parameter.The <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OpaqueData</i> data type must be encoded in such a way that the content can be represented by a
 * character string. Binary data is not permitted,although
 * hyperlinks <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">to</i> binary data are.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getValue <em>Value</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getFormat <em>Format</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getLanguage <em>Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOpaqueData()
 * @model extendedMetaData="name='OpaqueData' kind='elementOnly'"
 * @generated
 */
public interface OpaqueData extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the instance value. Note that instance value should be encoded in such a way that it allows embedded structures. As an example, in XML Schema,
	 * this encoding should be to xs:anyType or an
	 * equivalent.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TsAnyType)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOpaqueData_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	TsAnyType getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TsAnyType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the format or encoding for <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">value. </i>This is typically recorded as the URI of a <a
	 * href="//http://www.ietf.org/rfc/rfc2046.txt" xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Mime Type</a>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(FormatReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOpaqueData_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatReference getFormat();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatReference value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the written or spoken language used in <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">value</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOpaqueData_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageReference getLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageReference value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if the format of the document involves an XML encoding, this contains the URI of a document that carries the corresponding XML Schema or DTD.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOpaqueData_Schema()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DocumentURI"
	 *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.OpaqueData#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

} // OpaqueData
