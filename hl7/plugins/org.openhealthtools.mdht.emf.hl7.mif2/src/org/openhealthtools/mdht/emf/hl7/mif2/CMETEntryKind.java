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
 * A representation of the literals of the enumeration '<em><b>CMET Entry Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines how the CMET may be entered
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCMETEntryKind()
 * @model extendedMetaData="name='CMETEntryKind'"
 * @generated
 */
public enum CMETEntryKind implements Enumerator {
	/**
	 * The '<em><b>Act</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACT_VALUE
	 * @generated
	 * @ordered
	 */
	ACT(0, "Act", "Act"),

	/**
	 * The '<em><b>Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY(1, "Entity", "Entity"),

	/**
	 * The '<em><b>Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE(2, "Role", "Role"),

	/**
	 * The '<em><b>Role Played Or Performed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_PLAYED_OR_PERFORMED_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_PLAYED_OR_PERFORMED(3, "RolePlayedOrPerformed", "RolePlayedOrPerformed"),

	/**
	 * The '<em><b>Role Scoped Or Performed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_SCOPED_OR_PERFORMED_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_SCOPED_OR_PERFORMED(4, "RoleScopedOrPerformed", "RoleScopedOrPerformed"),

	/**
	 * The '<em><b>Role Performed Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_PERFORMED_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_PERFORMED_ONLY(5, "RolePerformedOnly", "RolePerformedOnly"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "Other", "Other");

	/**
	 * The '<em><b>Act</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET or stub is a kind of Act, and may be entered via Participation or ActRelationship
	 * <!-- end-model-doc -->
	 * @see #ACT
	 * @model name="Act"
	 * @generated
	 * @ordered
	 */
	public static final int ACT_VALUE = 0;

	/**
	 * The '<em><b>Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET or stub is a kind of Entity and may be entered via Role
	 * <!-- end-model-doc -->
	 * @see #ENTITY
	 * @model name="Entity"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_VALUE = 1;

	/**
	 * The '<em><b>Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET or stub is a Role.  May be entered via participation or along plays or scopes association from an Entity
	 * <!-- end-model-doc -->
	 * @see #ROLE
	 * @model name="Role"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_VALUE = 2;

	/**
	 * The '<em><b>Role Played Or Performed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET is a Role whose 'Scoping' association is already used or not intended to be used.  May be entered via participation or along plays association from an Entity
	 * <!-- end-model-doc -->
	 * @see #ROLE_PLAYED_OR_PERFORMED
	 * @model name="RolePlayedOrPerformed"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_PLAYED_OR_PERFORMED_VALUE = 3;

	/**
	 * The '<em><b>Role Scoped Or Performed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET is a Role whose 'Playing' association is already used or not intended to be used.  May be entered via participation or along scopes association from an Entity
	 * <!-- end-model-doc -->
	 * @see #ROLE_SCOPED_OR_PERFORMED
	 * @model name="RoleScopedOrPerformed"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_SCOPED_OR_PERFORMED_VALUE = 4;

	/**
	 * The '<em><b>Role Performed Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET is a Role whose 'Playing' and 'Scoping' associations are already used or not intended to be used.  May be entered via participation.
	 * <!-- end-model-doc -->
	 * @see #ROLE_PERFORMED_ONLY
	 * @model name="RolePerformedOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_PERFORMED_ONLY_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base of the CMET or stub is one of the "Dark Blue" non-backbone classes.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>CMET Entry Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CMETEntryKind[] VALUES_ARRAY = new CMETEntryKind[] {
			ACT, ENTITY, ROLE, ROLE_PLAYED_OR_PERFORMED, ROLE_SCOPED_OR_PERFORMED, ROLE_PERFORMED_ONLY, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>CMET Entry Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CMETEntryKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CMET Entry Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMETEntryKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMETEntryKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMET Entry Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMETEntryKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMETEntryKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMET Entry Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMETEntryKind get(int value) {
		switch (value) {
			case ACT_VALUE:
				return ACT;
			case ENTITY_VALUE:
				return ENTITY;
			case ROLE_VALUE:
				return ROLE;
			case ROLE_PLAYED_OR_PERFORMED_VALUE:
				return ROLE_PLAYED_OR_PERFORMED;
			case ROLE_SCOPED_OR_PERFORMED_VALUE:
				return ROLE_SCOPED_OR_PERFORMED;
			case ROLE_PERFORMED_ONLY_VALUE:
				return ROLE_PERFORMED_ONLY;
			case OTHER_VALUE:
				return OTHER;
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
	private CMETEntryKind(int value, String name, String literal) {
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

} // CMETEntryKind
