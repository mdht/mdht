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
 * A representation of the literals of the enumeration '<em><b>Entity Class Place</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getEntityClassPlace()
 * @model
 * @generated
 */
public enum EntityClassPlace implements Enumerator {
	/**
	 * The '<em><b>CITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_VALUE
	 * @generated
	 * @ordered
	 */
	CITY(0, "CITY", "CITY"),

	/**
	 * The '<em><b>COUNTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTRY(1, "COUNTRY", "COUNTRY"),

	/**
	 * The '<em><b>COUNTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTY_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTY(2, "COUNTY", "COUNTY"),

	/**
	 * The '<em><b>PLC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLC_VALUE
	 * @generated
	 * @ordered
	 */
	PLC(3, "PLC", "PLC"),

	/**
	 * The '<em><b>PROVINCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVINCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROVINCE(4, "PROVINCE", "PROVINCE");

	/**
	 * The '<em><b>CITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CITY_VALUE = 0;

	/**
	 * The '<em><b>COUNTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COUNTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY_VALUE = 1;

	/**
	 * The '<em><b>COUNTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COUNTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUNTY_VALUE = 2;

	/**
	 * The '<em><b>PLC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLC_VALUE = 3;

	/**
	 * The '<em><b>PROVINCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVINCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVINCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROVINCE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Entity Class Place</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityClassPlace[] VALUES_ARRAY = new EntityClassPlace[] {
			CITY, COUNTRY, COUNTY, PLC, PROVINCE, };

	/**
	 * A public read-only list of all the '<em><b>Entity Class Place</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityClassPlace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Class Place</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityClassPlace get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityClassPlace result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Class Place</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityClassPlace getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityClassPlace result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Class Place</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityClassPlace get(int value) {
		switch (value) {
			case CITY_VALUE:
				return CITY;
			case COUNTRY_VALUE:
				return COUNTRY;
			case COUNTY_VALUE:
				return COUNTY;
			case PLC_VALUE:
				return PLC;
			case PROVINCE_VALUE:
				return PROVINCE;
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
	private EntityClassPlace(int value, String name, String literal) {
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

} // EntityClassPlace
