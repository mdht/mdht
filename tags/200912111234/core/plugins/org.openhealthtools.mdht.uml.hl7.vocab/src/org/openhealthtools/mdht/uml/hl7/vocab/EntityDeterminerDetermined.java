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
 * A representation of the literals of the enumeration '<em><b>Entity Determiner Determined</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getEntityDeterminerDetermined()
 * @model
 * @generated
 */
public enum EntityDeterminerDetermined implements Enumerator {
	/**
	 * The '<em><b>KIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIND_VALUE
	 * @generated
	 * @ordered
	 */
	KIND(0, "KIND", "KIND"),

	/**
	 * The '<em><b>QUANTIFIEDKIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTIFIEDKIND_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTIFIEDKIND(1, "QUANTIFIEDKIND", "QUANTIFIEDKIND");

	/**
	 * The '<em><b>KIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KIND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KIND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KIND_VALUE = 0;

	/**
	 * The '<em><b>QUANTIFIEDKIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUANTIFIEDKIND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTIFIEDKIND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUANTIFIEDKIND_VALUE = 1;

	/**
	 * An array of all the '<em><b>Entity Determiner Determined</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityDeterminerDetermined[] VALUES_ARRAY =
		new EntityDeterminerDetermined[] {
			KIND,
			QUANTIFIEDKIND,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Determiner Determined</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityDeterminerDetermined> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Determiner Determined</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityDeterminerDetermined get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityDeterminerDetermined result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Determiner Determined</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityDeterminerDetermined getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityDeterminerDetermined result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Determiner Determined</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityDeterminerDetermined get(int value) {
		switch (value) {
			case KIND_VALUE: return KIND;
			case QUANTIFIEDKIND_VALUE: return QUANTIFIEDKIND;
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
	private EntityDeterminerDetermined(int value, String name, String literal) {
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
	
} //EntityDeterminerDetermined
