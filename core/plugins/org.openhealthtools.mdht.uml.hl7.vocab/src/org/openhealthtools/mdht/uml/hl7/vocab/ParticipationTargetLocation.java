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
 * A representation of the literals of the enumeration '<em><b>Participation Target Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getParticipationTargetLocation()
 * @model
 * @generated
 */
public enum ParticipationTargetLocation implements Enumerator {
	/**
	 * The '<em><b>DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DST_VALUE
	 * @generated
	 * @ordered
	 */
	DST(0, "DST", "DST"),

	/**
	 * The '<em><b>ELOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELOC_VALUE
	 * @generated
	 * @ordered
	 */
	ELOC(1, "ELOC", "ELOC"),

	/**
	 * The '<em><b>LOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOC_VALUE
	 * @generated
	 * @ordered
	 */
	LOC(2, "LOC", "LOC"),

	/**
	 * The '<em><b>ORG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORG_VALUE
	 * @generated
	 * @ordered
	 */
	ORG(3, "ORG", "ORG"),

	/**
	 * The '<em><b>RML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RML_VALUE
	 * @generated
	 * @ordered
	 */
	RML(4, "RML", "RML"),

	/**
	 * The '<em><b>VIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_VALUE
	 * @generated
	 * @ordered
	 */
	VIA(5, "VIA", "VIA");

	/**
	 * The '<em><b>DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DST_VALUE = 0;

	/**
	 * The '<em><b>ELOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELOC_VALUE = 1;

	/**
	 * The '<em><b>LOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOC_VALUE = 2;

	/**
	 * The '<em><b>ORG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORG_VALUE = 3;

	/**
	 * The '<em><b>RML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RML_VALUE = 4;

	/**
	 * The '<em><b>VIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIA_VALUE = 5;

	/**
	 * An array of all the '<em><b>Participation Target Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParticipationTargetLocation[] VALUES_ARRAY =
		new ParticipationTargetLocation[] {
			DST,
			ELOC,
			LOC,
			ORG,
			RML,
			VIA,
		};

	/**
	 * A public read-only list of all the '<em><b>Participation Target Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParticipationTargetLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participation Target Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParticipationTargetLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationTargetLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Target Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParticipationTargetLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationTargetLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Target Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParticipationTargetLocation get(int value) {
		switch (value) {
			case DST_VALUE: return DST;
			case ELOC_VALUE: return ELOC;
			case LOC_VALUE: return LOC;
			case ORG_VALUE: return ORG;
			case RML_VALUE: return RML;
			case VIA_VALUE: return VIA;
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
	private ParticipationTargetLocation(int value, String name, String literal) {
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
	
} //ParticipationTargetLocation
