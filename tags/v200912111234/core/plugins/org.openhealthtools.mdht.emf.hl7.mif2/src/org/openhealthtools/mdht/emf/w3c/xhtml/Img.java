/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Img</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To avoid accessibility problems for people who aren't able to see the image, you should provide a text description using the alt and longdesc attributes. In addition, avoid the use of server-side image maps. Note that in this DTD there is no name attribute. That is only available in the transitional and frameset DTD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHeight <em>Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHl7Id <em>Hl7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getImageType <em>Image Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getSrc <em>Src</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getStyle <em>Style</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg()
 * @model extendedMetaData="name='Img' kind='elementOnly'"
 * @generated
 */
public interface Img extends EObject {
	/**
	 * Returns the value of the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A small rendition of the pixmap image intended to be used as a place-holder (often with a hyperlink to the larger pixmap image) when space constraints prevent the display of the full-size image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thumbnail</em>' containment reference.
	 * @see #setThumbnail(Img)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Thumbnail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thumbnail' namespace='##targetNamespace'"
	 * @generated
	 */
	Img getThumbnail();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getThumbnail <em>Thumbnail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail</em>' containment reference.
	 * @see #getThumbnail()
	 * @generated
	 */
	void setThumbnail(Img value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a description which can be rendered in place of the graphic
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Alt()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Text" required="true"
	 *        extendedMetaData="kind='attribute' name='alt'"
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * space separated list of classes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #setClass(MifClassType)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Class()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	MifClassType getClass_();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(MifClassType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(MifClassType)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getClass_ <em>Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class</em>' attribute is set.
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @see #setClass(MifClassType)
	 * @generated
	 */
	boolean isSetClass();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the image be scaled to the specified vertical size or percentage of the available vertical space
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Height()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Hl7 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a unique identifier for the element within the context of the element containing the markup, not necessarily the entire document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7 Id</em>' attribute.
	 * @see #setHl7Id(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Hl7Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='hl7Id'"
	 * @generated
	 */
	String getHl7Id();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHl7Id <em>Hl7 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7 Id</em>' attribute.
	 * @see #getHl7Id()
	 * @generated
	 */
	void setHl7Id(String value);

	/**
	 * Returns the value of the '<em><b>Image Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines what format the image is stored in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
	 * @see #isSetImageType()
	 * @see #unsetImageType()
	 * @see #setImageType(ImageKind)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_ImageType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='imageType'"
	 * @generated
	 */
	ImageKind getImageType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getImageType <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
	 * @see #isSetImageType()
	 * @see #unsetImageType()
	 * @see #getImageType()
	 * @generated
	 */
	void setImageType(ImageKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getImageType <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImageType()
	 * @see #getImageType()
	 * @see #setImageType(ImageKind)
	 * @generated
	 */
	void unsetImageType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getImageType <em>Image Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image Type</em>' attribute is set.
	 * @see #unsetImageType()
	 * @see #getImageType()
	 * @see #setImageType(ImageKind)
	 * @generated
	 */
	boolean isSetImageType();

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * language code (as per XML 1.0 spec)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates where the image is located.  Path should be expressed based on the package in which the image is stored
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Src()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.URI" required="true"
	 *        extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * associated style info
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(StyleSheet)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Style()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	StyleSheet getStyle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleSheet value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleSheet)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleSheet)
	 * @generated
	 */
	boolean isSetStyle();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the image be scaled to the specified horizontal size or percentage of the available horizontal space
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImg_Width()
	 * @model dataType="org.openhealthtools.mdht.emf.w3c.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // Img
