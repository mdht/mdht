/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.vocab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role Class Service Delivery Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getRoleClassServiceDeliveryLocation()
 * @model
 * @generated
 */
public enum RoleClassServiceDeliveryLocation implements Enumerator {
	/**
	 * The '<em><b>DSDLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSDLOC_VALUE
	 * @generated
	 * @ordered
	 */
	DSDLOC(0, "DSDLOC", "DSDLOC"),

	/**
	 * The '<em><b>ISDLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISDLOC_VALUE
	 * @generated
	 * @ordered
	 */
	ISDLOC(1, "ISDLOC", "ISDLOC"),

	/**
	 * The '<em><b>SDLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDLOC_VALUE
	 * @generated
	 * @ordered
	 */
	SDLOC(2, "SDLOC", "SDLOC");

	/**
	 * The '<em><b>DSDLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSDLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSDLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSDLOC_VALUE = 0;

	/**
	 * The '<em><b>ISDLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISDLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISDLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISDLOC_VALUE = 1;

	/**
	 * The '<em><b>SDLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SDLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SDLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SDLOC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Role Class Service Delivery Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoleClassServiceDeliveryLocation[] VALUES_ARRAY =
		new RoleClassServiceDeliveryLocation[] {
			DSDLOC,
			ISDLOC,
			SDLOC,
		};

	/**
	 * A public read-only list of all the '<em><b>Role Class Service Delivery Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoleClassServiceDeliveryLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role Class Service Delivery Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassServiceDeliveryLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleClassServiceDeliveryLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Class Service Delivery Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassServiceDeliveryLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleClassServiceDeliveryLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Class Service Delivery Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassServiceDeliveryLocation get(int value) {
		switch (value) {
			case DSDLOC_VALUE: return DSDLOC;
			case ISDLOC_VALUE: return ISDLOC;
			case SDLOC_VALUE: return SDLOC;
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
	private RoleClassServiceDeliveryLocation(int value, String name, String literal) {
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
	
} //RoleClassServiceDeliveryLocation
