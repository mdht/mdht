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
 * A representation of the literals of the enumeration '<em><b>Role Class Specimen</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getRoleClassSpecimen()
 * @model
 * @generated
 */
public enum RoleClassSpecimen implements Enumerator {
	/**
	 * The '<em><b>ALQT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALQT_VALUE
	 * @generated
	 * @ordered
	 */
	ALQT(0, "ALQT", "ALQT"),

	/**
	 * The '<em><b>ISLT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISLT_VALUE
	 * @generated
	 * @ordered
	 */
	ISLT(1, "ISLT", "ISLT"),

	/**
	 * The '<em><b>SPEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEC_VALUE
	 * @generated
	 * @ordered
	 */
	SPEC(2, "SPEC", "SPEC");

	/**
	 * The '<em><b>ALQT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALQT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALQT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALQT_VALUE = 0;

	/**
	 * The '<em><b>ISLT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISLT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISLT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISLT_VALUE = 1;

	/**
	 * The '<em><b>SPEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Role Class Specimen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoleClassSpecimen[] VALUES_ARRAY = new RoleClassSpecimen[] { ALQT, ISLT, SPEC, };

	/**
	 * A public read-only list of all the '<em><b>Role Class Specimen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoleClassSpecimen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role Class Specimen</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassSpecimen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleClassSpecimen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Class Specimen</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassSpecimen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleClassSpecimen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Class Specimen</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleClassSpecimen get(int value) {
		switch (value) {
			case ALQT_VALUE:
				return ALQT;
			case ISLT_VALUE:
				return ISLT;
			case SPEC_VALUE:
				return SPEC;
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
	private RoleClassSpecimen(int value, String name, String literal) {
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

} // RoleClassSpecimen
