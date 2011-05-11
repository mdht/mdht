/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.vocab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>xEncounter Participant</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getx_EncounterParticipant()
 * @model
 * @generated
 */
public enum x_EncounterParticipant implements Enumerator {
	/**
	 * The '<em><b>ADM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADM_VALUE
	 * @generated
	 * @ordered
	 */
	ADM(0, "ADM", "ADM"),

	/**
	 * The '<em><b>ATND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATND_VALUE
	 * @generated
	 * @ordered
	 */
	ATND(1, "ATND", "ATND"),

	/**
	 * The '<em><b>CON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CON_VALUE
	 * @generated
	 * @ordered
	 */
	CON(2, "CON", "CON"),

	/**
	 * The '<em><b>DIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIS_VALUE
	 * @generated
	 * @ordered
	 */
	DIS(3, "DIS", "DIS"),

	/**
	 * The '<em><b>REF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(4, "REF", "REF");

	/**
	 * The '<em><b>ADM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADM_VALUE = 0;

	/**
	 * The '<em><b>ATND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATND_VALUE = 1;

	/**
	 * The '<em><b>CON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CON_VALUE = 2;

	/**
	 * The '<em><b>DIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIS_VALUE = 3;

	/**
	 * The '<em><b>REF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REF_VALUE = 4;

	/**
	 * An array of all the '<em><b>xEncounter Participant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final x_EncounterParticipant[] VALUES_ARRAY =
		new x_EncounterParticipant[] {
			ADM,
			ATND,
			CON,
			DIS,
			REF,
		};

	/**
	 * A public read-only list of all the '<em><b>xEncounter Participant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<x_EncounterParticipant> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>xEncounter Participant</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_EncounterParticipant get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_EncounterParticipant result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xEncounter Participant</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_EncounterParticipant getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_EncounterParticipant result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xEncounter Participant</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_EncounterParticipant get(int value) {
		switch (value) {
			case ADM_VALUE: return ADM;
			case ATND_VALUE: return ATND;
			case CON_VALUE: return CON;
			case DIS_VALUE: return DIS;
			case REF_VALUE: return REF;
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
	private x_EncounterParticipant(int value, String name, String literal) {
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
	
} //x_EncounterParticipant
