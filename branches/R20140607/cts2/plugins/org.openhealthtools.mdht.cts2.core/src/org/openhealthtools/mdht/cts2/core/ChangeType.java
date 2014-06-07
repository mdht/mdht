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
 * A representation of the literals of the enumeration '<em><b>Change Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * An indicator that shows the type of change that occurred that transformed a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i>
 * element from its immediately previous state to the state that the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeType</i> is associated
 * with.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeType()
 * @model extendedMetaData="name='ChangeType'"
 * @generated
 */
public enum ChangeType implements Enumerator {
	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(0, "CREATE", "CREATE"),

	/**
	 * The '<em><b>UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(1, "UPDATE", "UPDATE"),

	/**
	 * The '<em><b>METADATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA(2, "METADATA", "METADATA"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(3, "DELETE", "DELETE"),

	/**
	 * The '<em><b>CLONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CLONE_VALUE
	 * @generated
	 * @ordered
	 */
	CLONE(4, "CLONE", "CLONE"),

	/**
	 * The '<em><b>IMPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORT(5, "IMPORT", "IMPORT");

	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the element was newly created.
	 * <!-- end-model-doc -->
	 * 
	 * @see #CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 0;

	/**
	 * The '<em><b>UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * one or more non-identifying attributes of the element changed. Note that <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">UPDATE</i> does
	 * not include changes to the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> attributes (<i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entryState</i>, <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">status</i>, and <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">owner</i>).
	 * These are considered to be <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">METADATA</i> changes.
	 * <!-- end-model-doc -->
	 * 
	 * @see #UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 1;

	/**
	 * The '<em><b>METADATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a change occurred to the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entryState</i> or <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">status</i> attributes. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">METADATA</i>
	 * changes are separated because they may often be service specific.
	 * <!-- end-model-doc -->
	 * 
	 * @see #METADATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_VALUE = 2;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the changeable element was completely removed from the service and may no longer be retrieved by id <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">or</i> search. Service implementations may choose to disable and/or map <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">DELETE</i> operations to
	 * some other form, but this exists to allow the complete removal of errors and historically irrelevant information.
	 * <!-- end-model-doc -->
	 * 
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 3;

	/**
	 * The '<em><b>CLONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * create the new versionable resource and create a (virtual) copy of all of the resource's dependents
	 * <!-- end-model-doc -->
	 * 
	 * @see #CLONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLONE_VALUE = 4;

	/**
	 * The '<em><b>IMPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * include the contents of an external resource version as a read-only part of the importing version
	 * <!-- end-model-doc -->
	 * 
	 * @see #IMPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPORT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Change Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ChangeType[] VALUES_ARRAY = new ChangeType[] {
			CREATE, UPDATE, METADATA, DELETE, CLONE, IMPORT, };

	/**
	 * A public read-only list of all the '<em><b>Change Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ChangeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ChangeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ChangeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ChangeType get(int value) {
		switch (value) {
			case CREATE_VALUE:
				return CREATE;
			case UPDATE_VALUE:
				return UPDATE;
			case METADATA_VALUE:
				return METADATA;
			case DELETE_VALUE:
				return DELETE;
			case CLONE_VALUE:
				return CLONE;
			case IMPORT_VALUE:
				return IMPORT;
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
	private ChangeType(int value, String name, String literal) {
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

} // ChangeType
