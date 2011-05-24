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
 * A representation of the literals of the enumeration '<em><b>Vote Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the allowed types of individual responses within a ballot response.
 * UML: Type used in a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVoteKind()
 * @model extendedMetaData="name='VoteKind'"
 * @generated
 */
public enum VoteKind implements Enumerator {
	/**
	 * The '<em><b>Affirmative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE(0, "Affirmative", "Affirmative"),

	/**
	 * The '<em><b>Abstain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTAIN(1, "Abstain", "Abstain"),

	/**
	 * The '<em><b>Negative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE(2, "Negative", "Negative");

	/**
	 * The '<em><b>Affirmative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The voter wants the ballot to pass
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE
	 * @model name="Affirmative"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_VALUE = 0;

	/**
	 * The '<em><b>Abstain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The voter is not expressing an opinion on whether the ballot should pass
	 * <!-- end-model-doc -->
	 * @see #ABSTAIN
	 * @model name="Abstain"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTAIN_VALUE = 1;

	/**
	 * The '<em><b>Negative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The voter does *not* want the ballot to pass
	 * <!-- end-model-doc -->
	 * @see #NEGATIVE
	 * @model name="Negative"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Vote Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VoteKind[] VALUES_ARRAY = new VoteKind[] { AFFIRMATIVE, ABSTAIN, NEGATIVE, };

	/**
	 * A public read-only list of all the '<em><b>Vote Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VoteKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vote Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoteKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoteKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vote Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoteKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoteKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vote Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoteKind get(int value) {
		switch (value) {
			case AFFIRMATIVE_VALUE:
				return AFFIRMATIVE;
			case ABSTAIN_VALUE:
				return ABSTAIN;
			case NEGATIVE_VALUE:
				return NEGATIVE;
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
	private VoteKind(int value, String name, String literal) {
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

} // VoteKind
