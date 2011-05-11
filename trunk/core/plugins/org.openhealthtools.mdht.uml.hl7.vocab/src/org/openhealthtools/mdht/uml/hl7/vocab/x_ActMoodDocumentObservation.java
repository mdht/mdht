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
 * A representation of the literals of the enumeration '<em><b>xAct Mood Document Observation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getx_ActMoodDocumentObservation()
 * @model
 * @generated
 */
public enum x_ActMoodDocumentObservation implements Enumerator {
	/**
	 * The '<em><b>DEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEF_VALUE
	 * @generated
	 * @ordered
	 */
	DEF(0, "DEF", "DEF"),

	/**
	 * The '<em><b>EVN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVN_VALUE
	 * @generated
	 * @ordered
	 */
	EVN(1, "EVN", "EVN"),

	/**
	 * The '<em><b>GOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOL_VALUE
	 * @generated
	 * @ordered
	 */
	GOL(2, "GOL", "GOL"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(3, "INT", "INT"),

	/**
	 * The '<em><b>PRMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRMS_VALUE
	 * @generated
	 * @ordered
	 */
	PRMS(4, "PRMS", "PRMS"),

	/**
	 * The '<em><b>PRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRP_VALUE
	 * @generated
	 * @ordered
	 */
	PRP(5, "PRP", "PRP"),

	/**
	 * The '<em><b>RQO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQO_VALUE
	 * @generated
	 * @ordered
	 */
	RQO(6, "RQO", "RQO");

	/**
	 * The '<em><b>DEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEF_VALUE = 0;

	/**
	 * The '<em><b>EVN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVN_VALUE = 1;

	/**
	 * The '<em><b>GOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOL_VALUE = 2;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 3;

	/**
	 * The '<em><b>PRMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRMS_VALUE = 4;

	/**
	 * The '<em><b>PRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRP_VALUE = 5;

	/**
	 * The '<em><b>RQO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQO_VALUE = 6;

	/**
	 * An array of all the '<em><b>xAct Mood Document Observation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final x_ActMoodDocumentObservation[] VALUES_ARRAY =
		new x_ActMoodDocumentObservation[] {
			DEF,
			EVN,
			GOL,
			INT,
			PRMS,
			PRP,
			RQO,
		};

	/**
	 * A public read-only list of all the '<em><b>xAct Mood Document Observation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<x_ActMoodDocumentObservation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>xAct Mood Document Observation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActMoodDocumentObservation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActMoodDocumentObservation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Mood Document Observation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActMoodDocumentObservation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActMoodDocumentObservation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Mood Document Observation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActMoodDocumentObservation get(int value) {
		switch (value) {
			case DEF_VALUE: return DEF;
			case EVN_VALUE: return EVN;
			case GOL_VALUE: return GOL;
			case INT_VALUE: return INT;
			case PRMS_VALUE: return PRMS;
			case PRP_VALUE: return PRP;
			case RQO_VALUE: return RQO;
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
	private x_ActMoodDocumentObservation(int value, String name, String literal) {
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
	
} //x_ActMoodDocumentObservation
