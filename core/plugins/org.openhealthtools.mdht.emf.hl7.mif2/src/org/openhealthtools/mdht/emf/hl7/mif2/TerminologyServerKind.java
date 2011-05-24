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
 * A representation of the literals of the enumeration '<em><b>Terminology Server Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates the formats in which terminologies can be made available in.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTerminologyServerKind()
 * @model extendedMetaData="name='TerminologyServerKind'"
 * @generated
 */
public enum TerminologyServerKind implements Enumerator {
	/**
	 * The '<em><b>CTS10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTS10_VALUE
	 * @generated
	 * @ordered
	 */
	CTS10(0, "CTS10", "CTS1.0"),

	/**
	 * The '<em><b>CTS20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTS20_VALUE
	 * @generated
	 * @ordered
	 */
	CTS20(1, "CTS20", "CTS2.0"),

	/**
	 * The '<em><b>MIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIF_VALUE
	 * @generated
	 * @ordered
	 */
	MIF(2, "MIF", "MIF"),

	/**
	 * The '<em><b>Rendered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENDERED_VALUE
	 * @generated
	 * @ordered
	 */
	RENDERED(3, "Rendered", "Rendered"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(4, "Custom", "Custom");

	/**
	 * The '<em><b>CTS10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compliant with Common Terminology Services version 1.0.
	 * <!-- end-model-doc -->
	 * @see #CTS10
	 * @model literal="CTS1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CTS10_VALUE = 0;

	/**
	 * The '<em><b>CTS20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compliant with Common Terminology Services version 2.0.
	 * <!-- end-model-doc -->
	 * @see #CTS20
	 * @model literal="CTS2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CTS20_VALUE = 1;

	/**
	 * The '<em><b>MIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HL7 Model Interchange Format.
	 * <!-- end-model-doc -->
	 * @see #MIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIF_VALUE = 2;

	/**
	 * The '<em><b>Rendered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable rendered form (e.g. HTML, PDF).
	 * <!-- end-model-doc -->
	 * @see #RENDERED
	 * @model name="Rendered"
	 * @generated
	 * @ordered
	 */
	public static final int RENDERED_VALUE = 3;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A custom computable format (e.g. ASCII text files, Access databases)
	 * <!-- end-model-doc -->
	 * @see #CUSTOM
	 * @model name="Custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Terminology Server Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TerminologyServerKind[] VALUES_ARRAY = new TerminologyServerKind[] {
			CTS10, CTS20, MIF, RENDERED, CUSTOM, };

	/**
	 * A public read-only list of all the '<em><b>Terminology Server Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TerminologyServerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Terminology Server Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerminologyServerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TerminologyServerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Terminology Server Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerminologyServerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TerminologyServerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Terminology Server Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerminologyServerKind get(int value) {
		switch (value) {
			case CTS10_VALUE:
				return CTS10;
			case CTS20_VALUE:
				return CTS20;
			case MIF_VALUE:
				return MIF;
			case RENDERED_VALUE:
				return RENDERED;
			case CUSTOM_VALUE:
				return CUSTOM;
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
	private TerminologyServerKind(int value, String name, String literal) {
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

} // TerminologyServerKind
