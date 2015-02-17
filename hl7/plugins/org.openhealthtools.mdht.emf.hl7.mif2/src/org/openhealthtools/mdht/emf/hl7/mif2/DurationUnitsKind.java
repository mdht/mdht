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
 * A representation of the literals of the enumeration '<em><b>Duration Units Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Allowed units for measuring duration
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDurationUnitsKind()
 * @model extendedMetaData="name='DurationUnitsKind'"
 * @generated
 */
public enum DurationUnitsKind implements Enumerator {
	/**
	 * The '<em><b>Ms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_VALUE
	 * @generated
	 * @ordered
	 */
	MS(0, "ms", "ms"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(1, "s", "s"),

	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(2, "min", "min"),

	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(3, "h", "h"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(4, "d", "d");

	/**
	 * The '<em><b>Ms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millisecond
	 * <!-- end-model-doc -->
	 * @see #MS
	 * @model name="ms"
	 * @generated
	 * @ordered
	 */
	public static final int MS_VALUE = 0;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * second
	 * <!-- end-model-doc -->
	 * @see #S
	 * @model name="s"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 1;

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * minute
	 * <!-- end-model-doc -->
	 * @see #MIN
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 2;

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hour
	 * <!-- end-model-doc -->
	 * @see #H
	 * @model name="h"
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 3;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * day
	 * <!-- end-model-doc -->
	 * @see #D
	 * @model name="d"
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 4;

	/**
	 * An array of all the '<em><b>Duration Units Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DurationUnitsKind[] VALUES_ARRAY = new DurationUnitsKind[] { MS, S, MIN, H, D, };

	/**
	 * A public read-only list of all the '<em><b>Duration Units Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DurationUnitsKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Duration Units Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationUnitsKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DurationUnitsKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Duration Units Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationUnitsKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DurationUnitsKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Duration Units Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationUnitsKind get(int value) {
		switch (value) {
			case MS_VALUE:
				return MS;
			case S_VALUE:
				return S;
			case MIN_VALUE:
				return MIN;
			case H_VALUE:
				return H;
			case D_VALUE:
				return D;
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
	private DurationUnitsKind(int value, String name, String literal) {
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

} // DurationUnitsKind
