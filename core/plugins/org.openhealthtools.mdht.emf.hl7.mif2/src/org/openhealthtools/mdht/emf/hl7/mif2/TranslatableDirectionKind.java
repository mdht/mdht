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
 * A representation of the literals of the enumeration '<em><b>Translatable Direction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates in which translation can occur.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTranslatableDirectionKind()
 * @model extendedMetaData="name='TranslatableDirectionKind'"
 * @generated
 */
public enum TranslatableDirectionKind implements Enumerator {
	/**
	 * The '<em><b>Source To Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_TO_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_TO_TARGET(0, "sourceToTarget", "sourceToTarget"),

	/**
	 * The '<em><b>Target To Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_TO_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET_TO_SOURCE(1, "targetToSource", "targetToSource"),

	/**
	 * The '<em><b>Bi Directional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BI_DIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	BI_DIRECTIONAL(2, "biDirectional", "bi-directional");

	/**
	 * The '<em><b>Source To Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation can occur from the source concept to the target concept.
	 * <!-- end-model-doc -->
	 * @see #SOURCE_TO_TARGET
	 * @model name="sourceToTarget"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_TO_TARGET_VALUE = 0;

	/**
	 * The '<em><b>Target To Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation can occur from the target concept to the source concept.
	 * <!-- end-model-doc -->
	 * @see #TARGET_TO_SOURCE
	 * @model name="targetToSource"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_TO_SOURCE_VALUE = 1;

	/**
	 * The '<em><b>Bi Directional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation can occur both from from the source concept to target concept and from target to source.
	 * <!-- end-model-doc -->
	 * @see #BI_DIRECTIONAL
	 * @model name="biDirectional" literal="bi-directional"
	 * @generated
	 * @ordered
	 */
	public static final int BI_DIRECTIONAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Translatable Direction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TranslatableDirectionKind[] VALUES_ARRAY = new TranslatableDirectionKind[] {
			SOURCE_TO_TARGET, TARGET_TO_SOURCE, BI_DIRECTIONAL, };

	/**
	 * A public read-only list of all the '<em><b>Translatable Direction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TranslatableDirectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Translatable Direction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TranslatableDirectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TranslatableDirectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Translatable Direction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TranslatableDirectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TranslatableDirectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Translatable Direction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TranslatableDirectionKind get(int value) {
		switch (value) {
			case SOURCE_TO_TARGET_VALUE:
				return SOURCE_TO_TARGET;
			case TARGET_TO_SOURCE_VALUE:
				return TARGET_TO_SOURCE;
			case BI_DIRECTIONAL_VALUE:
				return BI_DIRECTIONAL;
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
	private TranslatableDirectionKind(int value, String name, String literal) {
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

} // TranslatableDirectionKind
