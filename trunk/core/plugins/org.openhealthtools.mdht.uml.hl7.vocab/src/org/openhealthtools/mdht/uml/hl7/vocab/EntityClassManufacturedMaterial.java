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
 * A representation of the literals of the enumeration '<em><b>Entity Class Manufactured Material</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getEntityClassManufacturedMaterial()
 * @model
 * @generated
 */
public enum EntityClassManufacturedMaterial implements Enumerator {
	/**
	 * The '<em><b>CER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CER_VALUE
	 * @generated
	 * @ordered
	 */
	CER(0, "CER", "CER"),

	/**
	 * The '<em><b>CONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONT_VALUE
	 * @generated
	 * @ordered
	 */
	CONT(1, "CONT", "CONT"),

	/**
	 * The '<em><b>DEV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEV_VALUE
	 * @generated
	 * @ordered
	 */
	DEV(2, "DEV", "DEV"),

	/**
	 * The '<em><b>HOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	HOLD(3, "HOLD", "HOLD"),

	/**
	 * The '<em><b>MMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MMAT_VALUE
	 * @generated
	 * @ordered
	 */
	MMAT(4, "MMAT", "MMAT"),

	/**
	 * The '<em><b>MODDV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODDV_VALUE
	 * @generated
	 * @ordered
	 */
	MODDV(5, "MODDV", "MODDV");

	/**
	 * The '<em><b>CER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CER_VALUE = 0;

	/**
	 * The '<em><b>CONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONT_VALUE = 1;

	/**
	 * The '<em><b>DEV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEV_VALUE = 2;

	/**
	 * The '<em><b>HOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOLD_VALUE = 3;

	/**
	 * The '<em><b>MMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MMAT_VALUE = 4;

	/**
	 * The '<em><b>MODDV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODDV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODDV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODDV_VALUE = 5;

	/**
	 * An array of all the '<em><b>Entity Class Manufactured Material</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityClassManufacturedMaterial[] VALUES_ARRAY =
		new EntityClassManufacturedMaterial[] {
			CER,
			CONT,
			DEV,
			HOLD,
			MMAT,
			MODDV,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Class Manufactured Material</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityClassManufacturedMaterial> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Class Manufactured Material</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityClassManufacturedMaterial get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityClassManufacturedMaterial result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Class Manufactured Material</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityClassManufacturedMaterial getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityClassManufacturedMaterial result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Class Manufactured Material</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityClassManufacturedMaterial get(int value) {
		switch (value) {
			case CER_VALUE: return CER;
			case CONT_VALUE: return CONT;
			case DEV_VALUE: return DEV;
			case HOLD_VALUE: return HOLD;
			case MMAT_VALUE: return MMAT;
			case MODDV_VALUE: return MODDV;
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
	private EntityClassManufacturedMaterial(int value, String name, String literal) {
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
	
} //EntityClassManufacturedMaterial
