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
 * A representation of the literals of the enumeration '<em><b>Entity Name Part Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getEntityNamePartQualifier()
 * @model
 * @generated
 */
public enum EntityNamePartQualifier implements Enumerator {
	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(0, "AC", "AC"),

	/**
	 * The '<em><b>AD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD_VALUE
	 * @generated
	 * @ordered
	 */
	AD(1, "AD", "AD"),

	/**
	 * The '<em><b>BR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BR_VALUE
	 * @generated
	 * @ordered
	 */
	BR(2, "BR", "BR"),

	/**
	 * The '<em><b>CL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CL_VALUE
	 * @generated
	 * @ordered
	 */
	CL(3, "CL", "CL"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(4, "IN", "IN"),

	/**
	 * The '<em><b>LS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LS_VALUE
	 * @generated
	 * @ordered
	 */
	LS(5, "LS", "LS"),

	/**
	 * The '<em><b>NB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NB_VALUE
	 * @generated
	 * @ordered
	 */
	NB(6, "NB", "NB"),

	/**
	 * The '<em><b>PR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PR_VALUE
	 * @generated
	 * @ordered
	 */
	PR(7, "PR", "PR"),

	/**
	 * The '<em><b>SP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_VALUE
	 * @generated
	 * @ordered
	 */
	SP(8, "SP", "SP"),

	/**
	 * The '<em><b>TITLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(9, "TITLE", "TITLE"),

	/**
	 * The '<em><b>VV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VV_VALUE
	 * @generated
	 * @ordered
	 */
	VV(10, "VV", "VV");

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 0;

	/**
	 * The '<em><b>AD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AD_VALUE = 1;

	/**
	 * The '<em><b>BR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BR_VALUE = 2;

	/**
	 * The '<em><b>CL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CL_VALUE = 3;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 4;

	/**
	 * The '<em><b>LS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LS_VALUE = 5;

	/**
	 * The '<em><b>NB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NB_VALUE = 6;

	/**
	 * The '<em><b>PR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PR_VALUE = 7;

	/**
	 * The '<em><b>SP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SP_VALUE = 8;

	/**
	 * The '<em><b>TITLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TITLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 9;

	/**
	 * The '<em><b>VV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VV_VALUE = 10;

	/**
	 * An array of all the '<em><b>Entity Name Part Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityNamePartQualifier[] VALUES_ARRAY =
		new EntityNamePartQualifier[] {
			AC,
			AD,
			BR,
			CL,
			IN,
			LS,
			NB,
			PR,
			SP,
			TITLE,
			VV,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Name Part Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityNamePartQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Name Part Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityNamePartQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNamePartQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Part Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityNamePartQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNamePartQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Part Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityNamePartQualifier get(int value) {
		switch (value) {
			case AC_VALUE: return AC;
			case AD_VALUE: return AD;
			case BR_VALUE: return BR;
			case CL_VALUE: return CL;
			case IN_VALUE: return IN;
			case LS_VALUE: return LS;
			case NB_VALUE: return NB;
			case PR_VALUE: return PR;
			case SP_VALUE: return SP;
			case TITLE_VALUE: return TITLE;
			case VV_VALUE: return VV;
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
	private EntityNamePartQualifier(int value, String name, String literal) {
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
	
} //EntityNamePartQualifier
