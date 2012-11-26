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
 * A representation of the literals of the enumeration '<em><b>Owner Scope Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates the scope of a property on a datatype
 * UML: Type for a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getOwnerScopeKind()
 * @model extendedMetaData="name='OwnerScopeKind'"
 * @generated
 */
public enum OwnerScopeKind implements Enumerator {
	/**
	 * The '<em><b>Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE(0, "instance", "instance"),

	/**
	 * The '<em><b>Classifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFIER(1, "classifier", "classifier");

	/**
	 * The '<em><b>Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property value can change for each datatype instance
	 * <!-- end-model-doc -->
	 * @see #INSTANCE
	 * @model name="instance"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_VALUE = 0;

	/**
	 * The '<em><b>Classifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property value is the same for all instances of a given datatype and can be invoked against the type definition itself
	 * <!-- end-model-doc -->
	 * @see #CLASSIFIER
	 * @model name="classifier"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFIER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Owner Scope Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OwnerScopeKind[] VALUES_ARRAY = new OwnerScopeKind[] { INSTANCE, CLASSIFIER, };

	/**
	 * A public read-only list of all the '<em><b>Owner Scope Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OwnerScopeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Owner Scope Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwnerScopeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OwnerScopeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Owner Scope Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwnerScopeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OwnerScopeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Owner Scope Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwnerScopeKind get(int value) {
		switch (value) {
			case INSTANCE_VALUE:
				return INSTANCE;
			case CLASSIFIER_VALUE:
				return CLASSIFIER;
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
	private OwnerScopeKind(int value, String name, String literal) {
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

} // OwnerScopeKind
