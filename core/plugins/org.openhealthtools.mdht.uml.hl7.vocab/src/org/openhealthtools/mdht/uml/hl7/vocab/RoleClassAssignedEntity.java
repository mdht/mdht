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
 * A representation of the literals of the enumeration '<em><b>Role Class Assigned Entity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getRoleClassAssignedEntity()
 * @model
 * @generated
 */
public enum RoleClassAssignedEntity implements Enumerator {
	/**
	 * The '<em><b>ASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(0, "ASSIGNED", "ASSIGNED"),

	/**
	 * The '<em><b>COMPAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPAR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPAR(1, "COMPAR", "COMPAR"),

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
	 * The '<em><b>ECON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECON_VALUE
	 * @generated
	 * @ordered
	 */
	ECON(3, "ECON", "ECON"),

	/**
	 * The '<em><b>NOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOK_VALUE
	 * @generated
	 * @ordered
	 */
	NOK(4, "NOK", "NOK"),

	/**
	 * The '<em><b>SGNOFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGNOFF_VALUE
	 * @generated
	 * @ordered
	 */
	SGNOFF(5, "SGNOFF", "SGNOFF");

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGNED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 0;

	/**
	 * The '<em><b>COMPAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPAR_VALUE = 1;

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
	 * The '<em><b>ECON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ECON_VALUE = 3;

	/**
	 * The '<em><b>NOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOK_VALUE = 4;

	/**
	 * The '<em><b>SGNOFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SGNOFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SGNOFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SGNOFF_VALUE = 5;

	/**
	 * An array of all the '<em><b>Role Class Assigned Entity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoleClassAssignedEntity[] VALUES_ARRAY =
		new RoleClassAssignedEntity[] {
			ASSIGNED,
			COMPAR,
			CON,
			ECON,
			NOK,
			SGNOFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Role Class Assigned Entity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoleClassAssignedEntity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role Class Assigned Entity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassAssignedEntity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleClassAssignedEntity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Class Assigned Entity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassAssignedEntity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleClassAssignedEntity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Class Assigned Entity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassAssignedEntity get(int value) {
		switch (value) {
			case ASSIGNED_VALUE: return ASSIGNED;
			case COMPAR_VALUE: return COMPAR;
			case CON_VALUE: return CON;
			case ECON_VALUE: return ECON;
			case NOK_VALUE: return NOK;
			case SGNOFF_VALUE: return SGNOFF;
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
	private RoleClassAssignedEntity(int value, String name, String literal) {
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
	
} //RoleClassAssignedEntity
