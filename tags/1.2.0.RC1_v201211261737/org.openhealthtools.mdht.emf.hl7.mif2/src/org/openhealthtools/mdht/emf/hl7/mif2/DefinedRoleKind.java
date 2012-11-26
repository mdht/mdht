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
 * A representation of the literals of the enumeration '<em><b>Defined Role Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Lists pre-defined roles that will commonly be used. (Ensures consistency of spelling, capitalization, etc.)
 * UML: Type used in a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDefinedRoleKind()
 * @model extendedMetaData="name='DefinedRoleKind'"
 * @generated
 */
public enum DefinedRoleKind implements Enumerator {
	/**
	 * The '<em><b>Committee Co Chair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMITTEE_CO_CHAIR_VALUE
	 * @generated
	 * @ordered
	 */
	COMMITTEE_CO_CHAIR(0, "CommitteeCoChair", "Committee co-chair"),

	/**
	 * The '<em><b>Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT(1, "Contact", "Contact"),

	/**
	 * The '<em><b>Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR(2, "Editor", "Editor"),

	/**
	 * The '<em><b>Primary Contributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_CONTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_CONTRIBUTOR(3, "PrimaryContributor", "Primary Contributor");

	/**
	 * The '<em><b>Committee Co Chair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who was a co-chair of one of the contributing committees at the time of ballot.  (Identify the committee in brackets following the person's name)
	 * <!-- end-model-doc -->
	 * @see #COMMITTEE_CO_CHAIR
	 * @model name="CommitteeCoChair" literal="Committee co-chair"
	 * @generated
	 * @ordered
	 */
	public static final int COMMITTEE_CO_CHAIR_VALUE = 0;

	/**
	 * The '<em><b>Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person to contact with questions about the ballot or its contents.
	 * <!-- end-model-doc -->
	 * @see #CONTACT
	 * @model name="Contact"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_VALUE = 1;

	/**
	 * The '<em><b>Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person with responsibility for the consolidation and organization of the ballot material.
	 * <!-- end-model-doc -->
	 * @see #EDITOR
	 * @model name="Editor"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_VALUE = 2;

	/**
	 * The '<em><b>Primary Contributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual who made substantial content contributions to the ballot material.
	 * <!-- end-model-doc -->
	 * @see #PRIMARY_CONTRIBUTOR
	 * @model name="PrimaryContributor" literal="Primary Contributor"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_CONTRIBUTOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Defined Role Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefinedRoleKind[] VALUES_ARRAY = new DefinedRoleKind[] {
			COMMITTEE_CO_CHAIR, CONTACT, EDITOR, PRIMARY_CONTRIBUTOR, };

	/**
	 * A public read-only list of all the '<em><b>Defined Role Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefinedRoleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Defined Role Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefinedRoleKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinedRoleKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Defined Role Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefinedRoleKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinedRoleKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Defined Role Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefinedRoleKind get(int value) {
		switch (value) {
			case COMMITTEE_CO_CHAIR_VALUE:
				return COMMITTEE_CO_CHAIR;
			case CONTACT_VALUE:
				return CONTACT;
			case EDITOR_VALUE:
				return EDITOR;
			case PRIMARY_CONTRIBUTOR_VALUE:
				return PRIMARY_CONTRIBUTOR;
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
	private DefinedRoleKind(int value, String name, String literal) {
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

} // DefinedRoleKind
