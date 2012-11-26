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
 * A representation of the literals of the enumeration '<em><b>Model Conformance Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the type of conformance rules the model is subject to.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getModelConformanceKind()
 * @model extendedMetaData="name='ModelConformanceKind'"
 * @generated
 */
public enum ModelConformanceKind implements Enumerator {
	/**
	 * The '<em><b>International</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL(0, "International", "International"),

	/**
	 * The '<em><b>Realm Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALM_EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	REALM_EXTENSION(1, "RealmExtension", "RealmExtension"),

	/**
	 * The '<em><b>Localization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCALIZATION(2, "Localization", "Localization");

	/**
	 * The '<em><b>International</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model is an international standard - no extensions allowed.
	 * <!-- end-model-doc -->
	 * @see #INTERNATIONAL
	 * @model name="International"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_VALUE = 0;

	/**
	 * The '<em><b>Realm Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Realm specific extensions allowed in the primary namespace.
	 * <!-- end-model-doc -->
	 * @see #REALM_EXTENSION
	 * @model name="RealmExtension"
	 * @generated
	 * @ordered
	 */
	public static final int REALM_EXTENSION_VALUE = 1;

	/**
	 * The '<em><b>Localization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-balloted specification.  Extensions allowed, but only in discrete namespaces
	 * <!-- end-model-doc -->
	 * @see #LOCALIZATION
	 * @model name="Localization"
	 * @generated
	 * @ordered
	 */
	public static final int LOCALIZATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Model Conformance Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelConformanceKind[] VALUES_ARRAY = new ModelConformanceKind[] {
			INTERNATIONAL, REALM_EXTENSION, LOCALIZATION, };

	/**
	 * A public read-only list of all the '<em><b>Model Conformance Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelConformanceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Conformance Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelConformanceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelConformanceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Conformance Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelConformanceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelConformanceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Conformance Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelConformanceKind get(int value) {
		switch (value) {
			case INTERNATIONAL_VALUE:
				return INTERNATIONAL;
			case REALM_EXTENSION_VALUE:
				return REALM_EXTENSION;
			case LOCALIZATION_VALUE:
				return LOCALIZATION;
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
	private ModelConformanceKind(int value, String name, String literal) {
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

} // ModelConformanceKind
