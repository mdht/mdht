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
 * A representation of the literals of the enumeration '<em><b>Style Sheet</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * style sheet data
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage#getStyleSheet()
 * @model extendedMetaData="name='StyleSheet'"
 * @generated
 */
public enum StyleSheet implements Enumerator {
	/**
	 * The '<em><b>Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENT(0, "Requirement", "Requirement"),

	/**
	 * The '<em><b>Indent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDENT_VALUE
	 * @generated
	 * @ordered
	 */
	INDENT(1, "Indent", "Indent"),

	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(2, "Note", "Note"),

	/**
	 * The '<em><b>Non Numbered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NUMBERED_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NUMBERED(3, "NonNumbered", "NonNumbered"),

	/**
	 * The '<em><b>Background Aqua</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_AQUA_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_AQUA(4, "BackgroundAqua", "Background:Aqua"),

	/**
	 * The '<em><b>Background Lime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_LIME_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_LIME(5, "BackgroundLime", "Background:Lime"),

	/**
	 * The '<em><b>Background Pink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_PINK_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_PINK(6, "BackgroundPink", "Background:Pink"),

	/**
	 * The '<em><b>Background Yellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_YELLOW(7, "BackgroundYellow", "Background:Yellow");

	/**
	 * The '<em><b>Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indented on a coloured background.
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENT
	 * @model name="Requirement"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_VALUE = 0;

	/**
	 * The '<em><b>Indent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indented (based on stylesheet indent scheme).  Indents nest.
	 * <!-- end-model-doc -->
	 * @see #INDENT
	 * @model name="Indent"
	 * @generated
	 * @ordered
	 */
	public static final int INDENT_VALUE = 1;

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefixed with 'Note:' and a hanging indent.  May be alternatively formatted.
	 * <!-- end-model-doc -->
	 * @see #NOTE
	 * @model name="Note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 2;

	/**
	 * The '<em><b>Non Numbered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the specified division should not have numbers.
	 * <!-- end-model-doc -->
	 * @see #NON_NUMBERED
	 * @model name="NonNumbered"
	 * @generated
	 * @ordered
	 */
	public static final int NON_NUMBERED_VALUE = 3;

	/**
	 * The '<em><b>Background Aqua</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the background color of the text to Aqua
	 * <!-- end-model-doc -->
	 * @see #BACKGROUND_AQUA
	 * @model name="BackgroundAqua" literal="Background:Aqua"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_AQUA_VALUE = 4;

	/**
	 * The '<em><b>Background Lime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the background color of the text to Lime
	 * <!-- end-model-doc -->
	 * @see #BACKGROUND_LIME
	 * @model name="BackgroundLime" literal="Background:Lime"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_LIME_VALUE = 5;

	/**
	 * The '<em><b>Background Pink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the background color of the text to Pink
	 * <!-- end-model-doc -->
	 * @see #BACKGROUND_PINK
	 * @model name="BackgroundPink" literal="Background:Pink"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_PINK_VALUE = 6;

	/**
	 * The '<em><b>Background Yellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the background color of the text to Yellow
	 * <!-- end-model-doc -->
	 * @see #BACKGROUND_YELLOW
	 * @model name="BackgroundYellow" literal="Background:Yellow"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_YELLOW_VALUE = 7;

	/**
	 * An array of all the '<em><b>Style Sheet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StyleSheet[] VALUES_ARRAY = new StyleSheet[] {
			REQUIREMENT, INDENT, NOTE, NON_NUMBERED, BACKGROUND_AQUA, BACKGROUND_LIME, BACKGROUND_PINK,
			BACKGROUND_YELLOW, };

	/**
	 * A public read-only list of all the '<em><b>Style Sheet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StyleSheet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Style Sheet</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyleSheet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StyleSheet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style Sheet</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyleSheet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StyleSheet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style Sheet</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyleSheet get(int value) {
		switch (value) {
			case REQUIREMENT_VALUE:
				return REQUIREMENT;
			case INDENT_VALUE:
				return INDENT;
			case NOTE_VALUE:
				return NOTE;
			case NON_NUMBERED_VALUE:
				return NON_NUMBERED;
			case BACKGROUND_AQUA_VALUE:
				return BACKGROUND_AQUA;
			case BACKGROUND_LIME_VALUE:
				return BACKGROUND_LIME;
			case BACKGROUND_PINK_VALUE:
				return BACKGROUND_PINK;
			case BACKGROUND_YELLOW_VALUE:
				return BACKGROUND_YELLOW;
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
	private StyleSheet(int value, String name, String literal) {
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

} // StyleSheet
