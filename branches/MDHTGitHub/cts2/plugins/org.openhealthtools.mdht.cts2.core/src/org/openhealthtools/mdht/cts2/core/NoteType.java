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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Note Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNoteType()
 * @model extendedMetaData="name='NoteType'"
 * @generated
 */
public enum NoteType implements Enumerator {
	/**
	 * The '<em><b>Change Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CHANGE_NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_NOTE(0, "ChangeNote", "ChangeNote"),

	/**
	 * The '<em><b>Editorial Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #EDITORIAL_NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	EDITORIAL_NOTE(1, "EditorialNote", "EditorialNote"),

	/**
	 * The '<em><b>History Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #HISTORY_NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY_NOTE(2, "HistoryNote", "HistoryNote"),

	/**
	 * The '<em><b>Scope Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SCOPE_NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	SCOPE_NOTE(3, "ScopeNote", "ScopeNote"),

	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(4, "Note", "Note");

	/**
	 * The '<em><b>Change Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A change note. See: skos:changeNote
	 * <!-- end-model-doc -->
	 * 
	 * @see #CHANGE_NOTE
	 * @model name="ChangeNote"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_NOTE_VALUE = 0;

	/**
	 * The '<em><b>Editorial Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An editorial note. See skos:editorialNote
	 * <!-- end-model-doc -->
	 * 
	 * @see #EDITORIAL_NOTE
	 * @model name="EditorialNote"
	 * @generated
	 * @ordered
	 */
	public static final int EDITORIAL_NOTE_VALUE = 1;

	/**
	 * The '<em><b>History Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A history note. See: skos:historyNote
	 * <!-- end-model-doc -->
	 * 
	 * @see #HISTORY_NOTE
	 * @model name="HistoryNote"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_NOTE_VALUE = 2;

	/**
	 * The '<em><b>Scope Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A scope note. See: skos:scopeNote
	 * <!-- end-model-doc -->
	 * 
	 * @see #SCOPE_NOTE
	 * @model name="ScopeNote"
	 * @generated
	 * @ordered
	 */
	public static final int SCOPE_NOTE_VALUE = 3;

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Undifferentiated See: skos:Note, but do not use for Definition or Example
	 * <!-- end-model-doc -->
	 * 
	 * @see #NOTE
	 * @model name="Note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final NoteType[] VALUES_ARRAY = new NoteType[] {
			CHANGE_NOTE, EDITORIAL_NOTE, HISTORY_NOTE, SCOPE_NOTE, NOTE, };

	/**
	 * A public read-only list of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<NoteType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static NoteType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static NoteType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static NoteType get(int value) {
		switch (value) {
			case CHANGE_NOTE_VALUE:
				return CHANGE_NOTE;
			case EDITORIAL_NOTE_VALUE:
				return EDITORIAL_NOTE;
			case HISTORY_NOTE_VALUE:
				return HISTORY_NOTE;
			case SCOPE_NOTE_VALUE:
				return SCOPE_NOTE;
			case NOTE_VALUE:
				return NOTE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private NoteType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // NoteType
