/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Form Markup With Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows unconstrained markup to identify the language in which it is expressed and when it was last translated
 * UML: Handled as 'mixed text' stored as a string, but with parallel tags identifying langage
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getLastTranslated <em>Last Translated</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreeFormMarkupWithLanguage()
 * @model extendedMetaData="name='FreeFormMarkupWithLanguage' kind='mixed'"
 * @generated
 */
public interface FreeFormMarkupWithLanguage extends VariousMixedContent {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * The default value is <code>"EN"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the language in which the marked up text is expressed
	 * UML: part of a complex stereotype tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #setLang(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreeFormMarkupWithLanguage_Lang()
	 * @model default="EN" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	void unsetLang();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getLang <em>Lang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lang</em>' attribute is set.
	 * @see #unsetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	boolean isSetLang();

	/**
	 * Returns the value of the '<em><b>Last Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when this languages rendition was last translated from the original.
	 * UML: part of a complex stereotype tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Translated</em>' attribute.
	 * @see #setLastTranslated(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreeFormMarkupWithLanguage_LastTranslated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='lastTranslated'"
	 * @generated
	 */
	XMLGregorianCalendar getLastTranslated();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getLastTranslated <em>Last Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Translated</em>' attribute.
	 * @see #getLastTranslated()
	 * @generated
	 */
	void setLastTranslated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the mime type in which the data is expressed.  If not specified, applications must interpret the content based on other context or specific application rules.  Applications that do not recognize content must retain it unchanged.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFreeFormMarkupWithLanguage_MimeType()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.MimeType"
	 *        extendedMetaData="kind='attribute' name='mimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // FreeFormMarkupWithLanguage
