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
 * A representation of the literals of the enumeration '<em><b>Sub Artifact Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the kind of sub artifacts that can be packaged within an artifact
 * UML: The name for a package in the package hierarchy
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubArtifactKind()
 * @model extendedMetaData="name='SubArtifactKind'"
 * @generated
 */
public enum SubArtifactKind implements Enumerator {
	/**
	 * The '<em><b>VD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VD_VALUE
	 * @generated
	 * @ordered
	 */
	VD(0, "VD", "VD"),

	/**
	 * The '<em><b>VC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VC_VALUE
	 * @generated
	 * @ordered
	 */
	VC(1, "VC", "VC"),

	/**
	 * The '<em><b>VS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VS_VALUE
	 * @generated
	 * @ordered
	 */
	VS(2, "VS", "VS");

	/**
	 * The '<em><b>VD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vocabulary Domain
	 * <!-- end-model-doc -->
	 * @see #VD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VD_VALUE = 0;

	/**
	 * The '<em><b>VC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vocabulary Code System
	 * <!-- end-model-doc -->
	 * @see #VC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VC_VALUE = 1;

	/**
	 * The '<em><b>VS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value Set
	 * <!-- end-model-doc -->
	 * @see #VS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sub Artifact Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubArtifactKind[] VALUES_ARRAY = new SubArtifactKind[] { VD, VC, VS, };

	/**
	 * A public read-only list of all the '<em><b>Sub Artifact Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubArtifactKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sub Artifact Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubArtifactKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubArtifactKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub Artifact Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubArtifactKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubArtifactKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub Artifact Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubArtifactKind get(int value) {
		switch (value) {
			case VD_VALUE:
				return VD;
			case VC_VALUE:
				return VC;
			case VS_VALUE:
				return VS;
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
	private SubArtifactKind(int value, String name, String literal) {
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

} // SubArtifactKind
