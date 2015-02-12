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
 * A representation of the literals of the enumeration '<em><b>Effort Quantifier Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies language that constraints can be expressed in.  (Excludes OCL, which is the default)
 * UML: Type used by a complex stereotype
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEffortQuantifierKind()
 * @model extendedMetaData="name='EffortQuantifierKind'"
 * @generated
 */
public enum EffortQuantifierKind implements Enumerator {
	/**
	 * The '<em><b>Person Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON_HOUR(0, "PersonHour", "PersonHour"),

	/**
	 * The '<em><b>Person Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON_DAY(1, "PersonDay", "PersonDay"),

	/**
	 * The '<em><b>Person Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON_YEAR(2, "PersonYear", "PersonYear"),

	/**
	 * The '<em><b>Hour Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR_DURATION(3, "HourDuration", "HourDuration"),

	/**
	 * The '<em><b>Day Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_DURATION(4, "DayDuration", "DayDuration"),

	/**
	 * The '<em><b>Month Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH_DURATION(5, "MonthDuration", "MonthDuration");

	/**
	 * The '<em><b>Person Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity is expressed in number of hours worked times number of people expending those hours
	 * <!-- end-model-doc -->
	 * @see #PERSON_HOUR
	 * @model name="PersonHour"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_HOUR_VALUE = 0;

	/**
	 * The '<em><b>Person Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity is expressed in number of regular days worked times number of people expending those hours
	 * <!-- end-model-doc -->
	 * @see #PERSON_DAY
	 * @model name="PersonDay"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_DAY_VALUE = 1;

	/**
	 * The '<em><b>Person Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity is expressed in number of years worked times number of people expending those hours
	 * <!-- end-model-doc -->
	 * @see #PERSON_YEAR
	 * @model name="PersonYear"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_YEAR_VALUE = 2;

	/**
	 * The '<em><b>Hour Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity is expressed in total length of calendar time in hours to be expended, independent of number of people
	 * <!-- end-model-doc -->
	 * @see #HOUR_DURATION
	 * @model name="HourDuration"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_DURATION_VALUE = 3;

	/**
	 * The '<em><b>Day Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity is expressed in total length of calendar time in days to be expended, independent of number of people
	 * <!-- end-model-doc -->
	 * @see #DAY_DURATION
	 * @model name="DayDuration"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_DURATION_VALUE = 4;

	/**
	 * The '<em><b>Month Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity is expressed in total length of calendar time in months to be expended, independent of number of people
	 * <!-- end-model-doc -->
	 * @see #MONTH_DURATION
	 * @model name="MonthDuration"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_DURATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Effort Quantifier Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EffortQuantifierKind[] VALUES_ARRAY = new EffortQuantifierKind[] {
			PERSON_HOUR, PERSON_DAY, PERSON_YEAR, HOUR_DURATION, DAY_DURATION, MONTH_DURATION, };

	/**
	 * A public read-only list of all the '<em><b>Effort Quantifier Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EffortQuantifierKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Effort Quantifier Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffortQuantifierKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffortQuantifierKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effort Quantifier Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffortQuantifierKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffortQuantifierKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effort Quantifier Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffortQuantifierKind get(int value) {
		switch (value) {
			case PERSON_HOUR_VALUE:
				return PERSON_HOUR;
			case PERSON_DAY_VALUE:
				return PERSON_DAY;
			case PERSON_YEAR_VALUE:
				return PERSON_YEAR;
			case HOUR_DURATION_VALUE:
				return HOUR_DURATION;
			case DAY_DURATION_VALUE:
				return DAY_DURATION;
			case MONTH_DURATION_VALUE:
				return MONTH_DURATION;
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
	private EffortQuantifierKind(int value, String name, String literal) {
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

} // EffortQuantifierKind
