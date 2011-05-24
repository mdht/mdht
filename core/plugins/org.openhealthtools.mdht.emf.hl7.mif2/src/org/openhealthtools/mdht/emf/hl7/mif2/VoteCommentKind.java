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
 * A representation of the literals of the enumeration '<em><b>Vote Comment Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * List of allowed votes
 * UML: Type for a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVoteCommentKind()
 * @model extendedMetaData="name='VoteCommentKind'"
 * @generated
 */
public enum VoteCommentKind implements Enumerator {
	/**
	 * The '<em><b>Affirmative Typo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_TYPO_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE_TYPO(0, "AffirmativeTypo", "Affirmative - Typo"),

	/**
	 * The '<em><b>Affirmative Suggestion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_SUGGESTION_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE_SUGGESTION(1, "AffirmativeSuggestion", "Affirmative - Suggestion"),

	/**
	 * The '<em><b>Affirmative Question</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE_QUESTION(2, "AffirmativeQuestion", "Affirmative - Question"),

	/**
	 * The '<em><b>Negative Minor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_MINOR(3, "NegativeMinor", "Negative - Minor"),

	/**
	 * The '<em><b>Negative Major</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_MAJOR(4, "NegativeMajor", "Negative - Major");

	/**
	 * The '<em><b>Affirmative Typo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vote is in favour of adoption of the balloted item, though spelling or grammar error that doesn not affect semantic needs to be 
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE_TYPO
	 * @model name="AffirmativeTypo" literal="Affirmative - Typo"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_TYPO_VALUE = 0;

	/**
	 * The '<em><b>Affirmative Suggestion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The voter is recommending a change to the content, but they are in favour of adoption of the balloted item regardless of whether the change is made.
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE_SUGGESTION
	 * @model name="AffirmativeSuggestion" literal="Affirmative - Suggestion"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_SUGGESTION_VALUE = 1;

	/**
	 * The '<em><b>Affirmative Question</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The voter has a question with respect to the content, however they are in favour of adoption of the balloted item regardless of whether or how the question is answered.
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE_QUESTION
	 * @model name="AffirmativeQuestion" literal="Affirmative - Question"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_QUESTION_VALUE = 2;

	/**
	 * The '<em><b>Negative Minor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vote is opposed to the adoption of the balloted item, with a need for minor changes in the item needed to resolve the negative.
	 * <!-- end-model-doc -->
	 * @see #NEGATIVE_MINOR
	 * @model name="NegativeMinor" literal="Negative - Minor"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_MINOR_VALUE = 3;

	/**
	 * The '<em><b>Negative Major</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vote is opposed to the adoption of the balloted item, with a need for significant changes or complete redevelopment of the item needed to resolve the negative.
	 * <!-- end-model-doc -->
	 * @see #NEGATIVE_MAJOR
	 * @model name="NegativeMajor" literal="Negative - Major"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_MAJOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Vote Comment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VoteCommentKind[] VALUES_ARRAY = new VoteCommentKind[] {
			AFFIRMATIVE_TYPO, AFFIRMATIVE_SUGGESTION, AFFIRMATIVE_QUESTION, NEGATIVE_MINOR, NEGATIVE_MAJOR, };

	/**
	 * A public read-only list of all the '<em><b>Vote Comment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VoteCommentKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vote Comment Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoteCommentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoteCommentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vote Comment Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoteCommentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoteCommentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vote Comment Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VoteCommentKind get(int value) {
		switch (value) {
			case AFFIRMATIVE_TYPO_VALUE:
				return AFFIRMATIVE_TYPO;
			case AFFIRMATIVE_SUGGESTION_VALUE:
				return AFFIRMATIVE_SUGGESTION;
			case AFFIRMATIVE_QUESTION_VALUE:
				return AFFIRMATIVE_QUESTION;
			case NEGATIVE_MINOR_VALUE:
				return NEGATIVE_MINOR;
			case NEGATIVE_MAJOR_VALUE:
				return NEGATIVE_MAJOR;
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
	private VoteCommentKind(int value, String name, String literal) {
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

} // VoteCommentKind
