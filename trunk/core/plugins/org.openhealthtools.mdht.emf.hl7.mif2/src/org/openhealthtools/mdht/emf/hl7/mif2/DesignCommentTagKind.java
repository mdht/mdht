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
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Design Comment Tag Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Flags allowed for design comments
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDesignCommentTagKind()
 * @model extendedMetaData="name='DesignCommentTagKind'"
 * @generated
 */
public enum DesignCommentTagKind implements Enumerator {
	/**
	 * The '<em><b>TODO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TODO_VALUE
	 * @generated
	 * @ordered
	 */
	TODO(0, "TODO", "TODO"),

	/**
	 * The '<em><b>FIXME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXME_VALUE
	 * @generated
	 * @ordered
	 */
	FIXME(1, "FIXME", "FIXME"),

	/**
	 * The '<em><b>NOTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(2, "NOTE", "NOTE");

	/**
	 * The '<em><b>TODO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates additional actions which need to be taken.
	 * <!-- end-model-doc -->
	 * @see #TODO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TODO_VALUE = 0;

	/**
	 * The '<em><b>FIXME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a situation where the existing content is known to be incomplete or incorrect.
	 * <!-- end-model-doc -->
	 * @see #FIXME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIXME_VALUE = 1;

	/**
	 * The '<em><b>NOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a generic comment about the design of the artifact.  E.g. Internal design rationale.
	 * <!-- end-model-doc -->
	 * @see #NOTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Design Comment Tag Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DesignCommentTagKind[] VALUES_ARRAY = new DesignCommentTagKind[] { TODO, FIXME, NOTE, };

	/**
	 * A public read-only list of all the '<em><b>Design Comment Tag Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DesignCommentTagKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Design Comment Tag Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignCommentTagKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DesignCommentTagKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Design Comment Tag Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignCommentTagKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DesignCommentTagKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Design Comment Tag Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignCommentTagKind get(int value) {
		switch (value) {
			case TODO_VALUE:
				return TODO;
			case FIXME_VALUE:
				return FIXME;
			case NOTE_VALUE:
				return NOTE;
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
	private DesignCommentTagKind(int value, String name, String literal) {
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

} // DesignCommentTagKind
