/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.w3c.xhtml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the type of image being represented.  Necessary to allow for proper image scaling.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getImageKind()
 * @model extendedMetaData="name='ImageKind'"
 * @generated
 */
public enum ImageKind implements Enumerator {
	/**
	 * The '<em><b>Application Postscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_POSTSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_POSTSCRIPT(0, "applicationPostscript", "application/postscript"),

	/**
	 * The '<em><b>Application Pdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PDF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PDF(1, "applicationPdf", "application/pdf"),

	/**
	 * The '<em><b>Application Png</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PNG_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PNG(2, "applicationPng", "application/png"),

	/**
	 * The '<em><b>Application Svg Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SVG_XML_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SVG_XML(3, "applicationSvgXml", "application/svg+xml"),

	/**
	 * The '<em><b>Application Jpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_JPEG(4, "applicationJpeg", "application/jpeg"),

	/**
	 * The '<em><b>Image Gif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GIF(5, "imageGif", "image/gif");

	/**
	 * The '<em><b>Application Postscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A post-script image.
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_POSTSCRIPT
	 * @model name="applicationPostscript" literal="application/postscript"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_POSTSCRIPT_VALUE = 0;

	/**
	 * The '<em><b>Application Pdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Adobe PDF document
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_PDF
	 * @model name="applicationPdf" literal="application/pdf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PDF_VALUE = 1;

	/**
	 * The '<em><b>Application Png</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Portable Network Graphic
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_PNG
	 * @model name="applicationPng" literal="application/png"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PNG_VALUE = 2;

	/**
	 * The '<em><b>Application Svg Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A scalable vector graphic
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_SVG_XML
	 * @model name="applicationSvgXml" literal="application/svg+xml"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SVG_XML_VALUE = 3;

	/**
	 * The '<em><b>Application Jpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A JPEG image
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_JPEG
	 * @model name="applicationJpeg" literal="application/jpeg"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_JPEG_VALUE = 4;

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
	public static final int IMAGE_GIF_VALUE = 5;

	/**
	 * An array of all the '<em><b>Image Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImageKind[] VALUES_ARRAY = new ImageKind[] {
			APPLICATION_POSTSCRIPT, APPLICATION_PDF, APPLICATION_PNG, APPLICATION_SVG_XML, APPLICATION_JPEG, IMAGE_GIF, };

	/**
	 * A public read-only list of all the '<em><b>Image Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImageKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageKind get(int value) {
		switch (value) {
			case APPLICATION_POSTSCRIPT_VALUE:
				return APPLICATION_POSTSCRIPT;
			case APPLICATION_PDF_VALUE:
				return APPLICATION_PDF;
			case APPLICATION_PNG_VALUE:
				return APPLICATION_PNG;
			case APPLICATION_SVG_XML_VALUE:
				return APPLICATION_SVG_XML;
			case APPLICATION_JPEG_VALUE:
				return APPLICATION_JPEG;
			case IMAGE_GIF_VALUE:
				return IMAGE_GIF;
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
	private ImageKind(int value, String name, String literal) {
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

} // ImageKind
