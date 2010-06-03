/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Media Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getMediaType()
 * @model extendedMetaData="name='MediaType'"
 * @generated
 */
public enum MediaType implements Enumerator {
	/**
	 * The '<em><b>Text Plain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_PLAIN(0, "textPlain", "text/plain"),

	/**
	 * The '<em><b>Text Html</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_HTML(1, "textHtml", "text/html"),

	/**
	 * The '<em><b>Application Pdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PDF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PDF(2, "applicationPdf", "application/pdf"),

	/**
	 * The '<em><b>Text Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_XML(3, "textXml", "text/xml"),

	/**
	 * The '<em><b>Text Rtf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RTF_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_RTF(4, "textRtf", "text/rtf"),

	/**
	 * The '<em><b>Application Msword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_MSWORD(5, "applicationMsword", "application/msword"),

	/**
	 * The '<em><b>Audio Mpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MPEG_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_MPEG(6, "audioMpeg", "audio/mpeg"),

	/**
	 * The '<em><b>Image Png</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_PNG(7, "imagePng", "image/png"),

	/**
	 * The '<em><b>Image Gif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GIF(8, "imageGif", "image/gif"),

	/**
	 * The '<em><b>Image Jpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_JPEG(9, "imageJpeg", "image/jpeg"),

	/**
	 * The '<em><b>Video Mpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MPEG_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_MPEG(10, "videoMpeg", "video/mpeg");

	/**
	 * The '<em><b>Text Plain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plain Text
	 * <!-- end-model-doc -->
	 * @see #TEXT_PLAIN
	 * @model name="textPlain" literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_PLAIN_VALUE = 0;

	/**
	 * The '<em><b>Text Html</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML Text
	 * <!-- end-model-doc -->
	 * @see #TEXT_HTML
	 * @model name="textHtml" literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_HTML_VALUE = 1;

	/**
	 * The '<em><b>Application Pdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PDF
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_PDF
	 * @model name="applicationPdf" literal="application/pdf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PDF_VALUE = 2;

	/**
	 * The '<em><b>Text Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XML Text
	 * <!-- end-model-doc -->
	 * @see #TEXT_XML
	 * @model name="textXml" literal="text/xml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_XML_VALUE = 3;

	/**
	 * The '<em><b>Text Rtf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTF Text
	 * <!-- end-model-doc -->
	 * @see #TEXT_RTF
	 * @model name="textRtf" literal="text/rtf"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_RTF_VALUE = 4;

	/**
	 * The '<em><b>Application Msword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Word
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_MSWORD
	 * @model name="applicationMsword" literal="application/msword"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_MSWORD_VALUE = 5;

	/**
	 * The '<em><b>Audio Mpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MPEG audil layer 3
	 * <!-- end-model-doc -->
	 * @see #AUDIO_MPEG
	 * @model name="audioMpeg" literal="audio/mpeg"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_MPEG_VALUE = 6;

	/**
	 * The '<em><b>Image Png</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PNG image
	 * <!-- end-model-doc -->
	 * @see #IMAGE_PNG
	 * @model name="imagePng" literal="image/png"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_PNG_VALUE = 7;

	/**
	 * The '<em><b>Image Gif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GIF 
	 * <!-- end-model-doc -->
	 * @see #IMAGE_GIF
	 * @model name="imageGif" literal="image/gif"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_GIF_VALUE = 8;

	/**
	 * The '<em><b>Image Jpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JPEG image
	 * <!-- end-model-doc -->
	 * @see #IMAGE_JPEG
	 * @model name="imageJpeg" literal="image/jpeg"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_JPEG_VALUE = 9;

	/**
	 * The '<em><b>Video Mpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MPEG Video
	 * <!-- end-model-doc -->
	 * @see #VIDEO_MPEG
	 * @model name="videoMpeg" literal="video/mpeg"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_MPEG_VALUE = 10;

	/**
	 * An array of all the '<em><b>Media Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MediaType[] VALUES_ARRAY =
		new MediaType[] {
			TEXT_PLAIN,
			TEXT_HTML,
			APPLICATION_PDF,
			TEXT_XML,
			TEXT_RTF,
			APPLICATION_MSWORD,
			AUDIO_MPEG,
			IMAGE_PNG,
			IMAGE_GIF,
			IMAGE_JPEG,
			VIDEO_MPEG,
		};

	/**
	 * A public read-only list of all the '<em><b>Media Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MediaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Media Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaType get(int value) {
		switch (value) {
			case TEXT_PLAIN_VALUE: return TEXT_PLAIN;
			case TEXT_HTML_VALUE: return TEXT_HTML;
			case APPLICATION_PDF_VALUE: return APPLICATION_PDF;
			case TEXT_XML_VALUE: return TEXT_XML;
			case TEXT_RTF_VALUE: return TEXT_RTF;
			case APPLICATION_MSWORD_VALUE: return APPLICATION_MSWORD;
			case AUDIO_MPEG_VALUE: return AUDIO_MPEG;
			case IMAGE_PNG_VALUE: return IMAGE_PNG;
			case IMAGE_GIF_VALUE: return IMAGE_GIF;
			case IMAGE_JPEG_VALUE: return IMAGE_JPEG;
			case VIDEO_MPEG_VALUE: return VIDEO_MPEG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MediaType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MediaType
