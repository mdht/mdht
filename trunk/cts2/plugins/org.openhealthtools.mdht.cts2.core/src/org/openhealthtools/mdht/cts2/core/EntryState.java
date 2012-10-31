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
 * A representation of the literals of the enumeration '<em><b>Entry State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * the current state of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> element. Note that <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entryState</i> represents the state of the element itself - <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">not</i> the state of a given change. The applicability of a given change is
 * identified by its <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">effectiveDate,</i> not <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entryState</i>.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntryState()
 * @model extendedMetaData="name='EntryState'"
 * @generated
 */
public enum EntryState implements Enumerator {
	/**
	 * The '<em><b>INACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(0, "INACTIVE", "INACTIVE"),

	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(1, "ACTIVE", "ACTIVE");

	/**
	 * The '<em><b>INACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeAble</i> element is no longer considered to be an active component. The element
	 * may still be retrieved if its <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entryID</i> is known, but it does not appear in search and
	 * browse operations
	 * unless specifically requested.
	 * <!-- end-model-doc -->
	 * 
	 * @see #INACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 0;

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> element is considered to be an active member of the containing resource
	 * and may appear in any search, browse or query operations.
	 * <!-- end-model-doc -->
	 * 
	 * @see #ACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Entry State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final EntryState[] VALUES_ARRAY = new EntryState[] { INACTIVE, ACTIVE, };

	/**
	 * A public read-only list of all the '<em><b>Entry State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<EntryState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entry State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static EntryState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntryState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entry State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static EntryState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntryState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entry State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static EntryState get(int value) {
		switch (value) {
			case INACTIVE_VALUE:
				return INACTIVE;
			case ACTIVE_VALUE:
				return ACTIVE;
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
	private EntryState(int value, String name, String literal) {
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

} // EntryState
